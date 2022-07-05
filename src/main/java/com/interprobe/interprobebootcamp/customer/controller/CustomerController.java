package com.interprobe.interprobebootcamp.customer.controller;

import com.interprobe.interprobebootcamp.customer.dto.CustomerResponseDTO;
import com.interprobe.interprobebootcamp.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author theLostCode
 * @Date 7/5/2022
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public ResponseEntity findAll(){
        List<CustomerResponseDTO> customerResponseDTOList = customerService.findAll();
        return ResponseEntity.ok();
    }
}
