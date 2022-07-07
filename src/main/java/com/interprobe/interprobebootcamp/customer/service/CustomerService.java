package com.interprobe.interprobebootcamp.customer.service;

import com.interprobe.interprobebootcamp.customer.dao.CustomerDao;
import com.interprobe.interprobebootcamp.customer.dto.CustomerResponseDTO;
import com.interprobe.interprobebootcamp.customer.dto.CustomerSaveRequestDTO;
import com.interprobe.interprobebootcamp.customer.dto.CustomerUpdateRequestDTO;
import com.interprobe.interprobebootcamp.customer.entity.Customer;
import com.interprobe.interprobebootcamp.customer.enums.CustomerErrorMessage;
import com.interprobe.interprobebootcamp.customer.enums.EnumStatus;
import com.interprobe.interprobebootcamp.customer.mapper.CustomerMapper;
import com.interprobe.interprobebootcamp.customer.service.entityservice.CustomerEntityService;
import com.interprobe.interprobebootcamp.generic.enums.GeneralErrorMessage;
import com.interprobe.interprobebootcamp.generic.exceptions.BusinessException;
import com.interprobe.interprobebootcamp.generic.exceptions.ItemNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author theLostCode
 * @Date 7/5/2022
 */
@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerEntityService customerEntityService;
    private final CustomerDao customerDao;


    public List<CustomerResponseDTO> findAll(){

        List<Customer> customerList = customerDao.findAll();

        return CustomerMapper.INSTANCE.convertToCustomerResponseDtoList(customerList);
    }

    public CustomerResponseDTO findById(Long id){

        Customer customer = customerEntityService.findByIdWithControl(id);

        return CustomerMapper.INSTANCE.convertToCustomerResponse(customer);

    }


    public CustomerResponseDTO save(CustomerSaveRequestDTO customerSaveRequestDTO){

        if (customerSaveRequestDTO == null){
            throw new BusinessException(GeneralErrorMessage.VALUES_CANNOT_BE_NULL);
        }

        Customer customer = CustomerMapper.INSTANCE.convertToCustomer(customerSaveRequestDTO);
        customer.setStatus(EnumStatus.ACTIVE);
        customer = customerDao.save(customer);

        return CustomerMapper.INSTANCE.convertToCustomerResponse(customer);
    }

    public void delete(Long id){
        customerDao.deleteById(id);
    }

    public void delete(Customer customer){
        customerDao.delete(customer);
    }

    public boolean isExist(Long id){
        return customerDao.existsById(id);
    }

    public CustomerResponseDTO cancel(long id){
        Customer customer = customerEntityService.findByIdWithControl(id);
        customer.setStatus(EnumStatus.PASSIVE);
        customer.setCancelDate(new Date());

        customer = customerEntityService.save(customer);

        return CustomerMapper.INSTANCE.convertToCustomerResponse(customer);
    }

    public CustomerResponseDTO update(CustomerUpdateRequestDTO customerUpdateRequestDTO){
        boolean isExist = customerEntityService.isExist(customerUpdateRequestDTO.getId());
        if (!isExist){
            throw new ItemNotFoundException(CustomerErrorMessage.CUSTOMER_DOES_NOT_EXIST);
        }

        Customer customer = CustomerMapper.INSTANCE.convertToCustomer(customerUpdateRequestDTO);

        customer = customerEntityService.save(customer);

        return CustomerMapper.INSTANCE.convertToCustomerResponse(customer);
    }
}
