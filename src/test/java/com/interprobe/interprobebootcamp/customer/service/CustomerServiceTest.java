package com.interprobe.interprobebootcamp.customer.service;

import com.interprobe.interprobebootcamp.customer.dto.CustomerResponseDTO;
import com.interprobe.interprobebootcamp.customer.service.entityservice.CustomerEntityService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

/**
 * @author theLostCode
 * @Date 7/6/2022
 */

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {

    @Mock // autowired olan alani buraya ekle
    private CustomerEntityService customerEntityService;

    @InjectMocks // nerde kullanilacaksa buraya ekle
    private CustomerService customerService;

    @Test
    void shouldFindAll() {
        List<CustomerResponseDTO> customerResponseDTOList = customerService.findAll();


    }

    @Test
    void findById() {

    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void testDelete() {
    }

    @Test
    void isExist() {
    }

    @Test
    void cancel() {
    }

    @Test
    void update() {
    }
}