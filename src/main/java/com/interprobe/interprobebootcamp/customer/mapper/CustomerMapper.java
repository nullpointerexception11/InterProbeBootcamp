package com.interprobe.interprobebootcamp.customer.mapper;

import com.interprobe.interprobebootcamp.customer.dto.CustomerResponseDTO;
import com.interprobe.interprobebootcamp.customer.dto.CustomerSaveRequestDTO;
import com.interprobe.interprobebootcamp.customer.dto.CustomerUpdateRequestDTO;
import com.interprobe.interprobebootcamp.customer.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author theLostCode
 * @Date 7/5/2022
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerResponseDTO convertToCustomerResponse(Customer customer);

    List<CustomerResponseDTO> convertToCustomerResponseDtoList(List<Customer> customerList);

    Customer convertToCustomer(CustomerSaveRequestDTO customerSaveRequestDTO);

    Customer convertToCustomer(CustomerUpdateRequestDTO customerUpdateRequestDTO);

}
