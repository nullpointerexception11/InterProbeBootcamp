package com.interprobe.interprobebootcamp.generic.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author theLostCode
 * @Date 7/5/2022
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestResponse<T> implements Serializable {

    private T data;
    private Date responseDate;
    private boolean isSuccess;
    private String messages;

    public RestResponse(T data, boolean isSuccess) {
        this.data = data;
        this.responseDate = new Date();
        this.isSuccess = isSuccess;
    }

    public static <T> RestResponse<T> of(T t) {
        return new RestResponse<>(t, true);
    }

    public static <T> RestResponse<T> error(T t) {
        return new RestResponse<>(t, false);
    }

    public static <T> RestResponse<T> empty() {
        return new RestResponse<>(null, true);
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }
}
