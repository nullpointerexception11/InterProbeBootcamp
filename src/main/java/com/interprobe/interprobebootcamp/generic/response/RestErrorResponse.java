package com.interprobe.interprobebootcamp.generic.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @author theLostCode
 * @Date 7/5/2022
 */
@Data
@AllArgsConstructor
public class RestErrorResponse {

    private Date errorDate;
    private String message;
    private String detail;
}
