package com.interprobe.interprobebootcamp.customer.controller;

import com.interprobe.interprobebootcamp.customer.dto.CustomerResponseDTO;
import com.interprobe.interprobebootcamp.customer.dto.CustomerSaveRequestDTO;
import com.interprobe.interprobebootcamp.customer.dto.CustomerUpdateRequestDTO;
import com.interprobe.interprobebootcamp.customer.service.CustomerService;
import com.interprobe.interprobebootcamp.generic.response.RestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    /**
     * pathVariable: localhost:8080/customers/1
     * requestParam: localhost:8080/customers?id=1&name=lostcode
     */

    @GetMapping
    public ResponseEntity findAll(){
        List<CustomerResponseDTO> customerResponseDTOList = customerService.findAll();
        return ResponseEntity.ok(RestResponse.of(customerResponseDTOList));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        CustomerResponseDTO customerResponseDTO = customerService.findById(id);
        return ResponseEntity.ok(RestResponse.of(customerResponseDTO));
    }

    @PostMapping
    public ResponseEntity save (@Valid @RequestBody CustomerSaveRequestDTO customerSaveRequestDTO){
        CustomerResponseDTO customerResponseDTO = customerService.save(customerSaveRequestDTO);
        return ResponseEntity.ok(RestResponse.of(customerResponseDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        customerService.delete(id);
        return ResponseEntity.ok(RestResponse.empty());
    }

    @PutMapping
    public ResponseEntity update(@RequestBody CustomerUpdateRequestDTO customerUpdateRequestDTO){
        CustomerResponseDTO customerResponseDTO = customerService.update(customerUpdateRequestDTO);
        return ResponseEntity.ok(RestResponse.of(customerResponseDTO));
    }

    @PatchMapping("/cancel/{id}")
    public ResponseEntity cancel(@PathVariable Long id){
        CustomerResponseDTO customerResponseDTO = customerService.cancel(id);
        return ResponseEntity.ok(RestResponse.of(customerResponseDTO));
    }
}
