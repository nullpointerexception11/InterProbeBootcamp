package com.interprobe.interprobebootcamp.springcore;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author theLostCode
 * @Date 7/1/2022
 */
@Component
@Qualifier("json")
public class ResponseConverterJson implements ResponseConverter {
    @Override
    public void convert() {
        System.out.println("JSON");
    }
}
