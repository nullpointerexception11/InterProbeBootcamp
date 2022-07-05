package com.interprobe.interprobebootcamp.customer.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * @author theLostCode
 * @Date 7/5/2022
 */
@Data
@Builder
public class CustomerSaveRequestDTO {

    @NotNull
    private String name;

    @NotNull
    private String surname;

    @NotNull
    @Size(min = 3, max = 10)
    private String username;

    @Size(min = 8)
    private String password;

    private String phoneNumber;

    private String email;

    private Date birthDate;
}
