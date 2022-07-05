package com.interprobe.interprobebootcamp.customer.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author theLostCode
 * @Date 7/5/2022
 */
@Data
public class CustomerUpdateRequestDTO {

    private Long id;
    private String name;
    private String surname;
    private String username;
    private String password;
    private String phoneNumber;
    private String email;
    private Date birthDate;
}
