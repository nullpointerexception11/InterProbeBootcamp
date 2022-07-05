package com.interprobe.interprobebootcamp.customer.service;

import com.interprobe.interprobebootcamp.customer.dao.CustomerDao;
import com.interprobe.interprobebootcamp.customer.dto.CustomerResponseDTO;
import com.interprobe.interprobebootcamp.customer.dto.CustomerSaveRequestDTO;
import com.interprobe.interprobebootcamp.customer.dto.CustomerUpdateRequestDTO;
import com.interprobe.interprobebootcamp.customer.entity.Customer;
import com.interprobe.interprobebootcamp.customer.enums.EnumStatus;
import com.interprobe.interprobebootcamp.customer.mapper.CustomerMapper;
import com.interprobe.interprobebootcamp.customer.service.entityservice.CustomerEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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

        List<CustomerResponseDTO> customerResponseDTOList = CustomerMapper.INSTANCE.convertToCustomerResponseDtoList(customerList);

        return customerResponseDTOList;
    }

//    public CustomerResponseDTO findById(Long id){
//
//      //  Customer customer = customerDao.findByIdWithControl(id);
//
//    }
//

    public CustomerResponseDTO save(CustomerSaveRequestDTO customerSaveRequestDTO){

//        if (customerSaveRequestDto == null){
//            throw new BusinessException(GeneralErrorMessage.VALUES_CANNOT_BE_NULL);
//        }
//
        Customer customer = CustomerMapper.INSTANCE.convertToCustomer(customerSaveRequestDTO);
        customer.setStatus(EnumStatus.ACTIVE);
        customer = customerDao.save(customer);

        CustomerResponseDTO customerResponseDTO = CustomerMapper.INSTANCE.convertToCustomerResponse(customer);
        return customerResponseDTO;
    }

    public void daelete(Long id){
        customerDao.deleteById(id);
    }

    public void daelete(Customer customer){
        customerDao.delete(customer);
    }

    public boolean isExist(Long id){
        return customerDao.existsById(id);
    }

    public CustomerResponseDTO cancel(long id){
//        Customer customer = customerEntityService.findByIdWithControl(id);
//        customer.setStatus(EnumStatus.PASSIVE);
//        customer.setCancelDate(new Date());
//
//        customer = customerEntityService.save(customer);
//
//        CustomerResponseDto customerResponseDto = CustomerMapper.INSTANCE.convertToCustomerResponseDto(customer);
//
//        return customerResponseDto;
    }

    public CustomerResponseDTO update(CustomerUpdateRequestDTO customerUpdateRequestDTO){
//        boolean isExist = customerEntityService.isExist(customerUpdateRequestDto.getId());
//        if (!isExist){
//            throw new ItemNotFoundException(CustomerErrorMessage.CUSTOMER_DOES_NOT_EXIST);
//        }
//
//        Customer customer = CustomerMapper.INSTANCE.convertToCustomer(customerUpdateRequestDto);
//
//        customer = customerEntityService.save(customer);
//
//        return CustomerMapper.INSTANCE.convertToCustomerResponseDto(customer);
    }
}
