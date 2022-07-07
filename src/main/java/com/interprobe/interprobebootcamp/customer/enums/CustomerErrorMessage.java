package com.interprobe.interprobebootcamp.customer.enums;

import com.interprobe.interprobebootcamp.generic.exceptions.BaseErrorMessage;

/**
 * @author theLostCode
 * @Date 7/6/2022
 */
public enum CustomerErrorMessage  implements BaseErrorMessage {

    CUSTOMER_DOES_NOT_EXIST("Customer does not exist!")
    ;

    private String message;

    CustomerErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}
