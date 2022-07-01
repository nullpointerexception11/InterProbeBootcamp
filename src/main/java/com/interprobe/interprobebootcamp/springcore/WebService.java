package com.interprobe.interprobebootcamp.springcore;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author theLostCode
 * @Date 7/1/2022
 */
@Component
public class WebService {
    // private ResponseConverter responseConverter;

    public ResponseConverter responseConverter; // private olmasi gerekir public tavsiye edilmez

    //constructor injection
    public WebService(@Qualifier("json") ResponseConverter responseConverter) { // @Qualifier burada kullanilir
        this.responseConverter = responseConverter;
    }

    //solid prensibine aykiri
//    public WebService() {
//        responseConverter = new ResponseConverterJson();
//    }

    //setter injection
//    public void setResponseConverter(ResponseConverter responseConverter) {
//        this.responseConverter = responseConverter;
//    }


    public void convert() {
        responseConverter.convert();
    }
}
