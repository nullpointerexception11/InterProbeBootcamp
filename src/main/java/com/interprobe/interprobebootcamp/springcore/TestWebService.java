package com.interprobe.interprobebootcamp.springcore;

/**
 * @author theLostCode
 * @Date 7/1/2022
 */
public class TestWebService {

    public static void main(String[] args) {

        ResponseConverterJson responseConverterJson = new ResponseConverterJson();

//        WebService webService = new WebService();
//        webService.setResponseConverter(new ResponseConverterJson()); // setter injection
//        webService.responseConverter = responseConverterJson; // field injection, tavsiye edilmez
        WebService webService = new WebService(responseConverterJson); // constructor injection

        webService.convert();
    }
}
