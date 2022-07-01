package com.interprobe.interprobebootcamp.springcore;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author theLostCode
 * @Date 7/1/2022
 */
@Component
//@Primary
@Qualifier("xml")
public class ResponseConverterXml implements ResponseConverter {
    @Override
    public void convert() {
        System.out.println("XML");
    }
}
