package com.interprobe.interprobebootcamp.generic.enums;

import com.interprobe.interprobebootcamp.generic.exceptions.BaseErrorMessage;

/**
 * @author theLostCode
 * @Date 7/5/2022
 */
public enum GeneralErrorMessage implements BaseErrorMessage {

    VALUES_CANNOT_BE_NULL("Values cannot be null"),
    ITEM_NOT_FOUND("Item not found!")
    ;

    private String message;

    GeneralErrorMessage(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}
