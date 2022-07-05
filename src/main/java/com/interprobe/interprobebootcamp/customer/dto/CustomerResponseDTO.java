package com.interprobe.interprobebootcamp.customer.dto;

import com.interprobe.interprobebootcamp.customer.enums.EnumStatus;
import lombok.Data;

import java.util.Date;

/**
 * @author theLostCode
 * @Date 7/5/2022
 */
@Data
public class CustomerResponseDTO {

    private Long id;
    private String name;
    private String surname;
    private String username;
    private String phoneNumber;
    private String email;
    private Date birthDate;
    private EnumStatus status;
    private Date cancelDate;
}
