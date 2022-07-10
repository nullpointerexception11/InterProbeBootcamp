package com.interprobe.interprobebootcamp.generic.util;

import com.interprobe.interprobebootcamp.generic.enums.GeneralErrorMessage;
import com.interprobe.interprobebootcamp.generic.exceptions.BusinessException;

import java.math.BigDecimal;

/**
 * @author theLostCode
 * @Date 7/6/2022
 */
public class MathUtil {

    public static BigDecimal sum(BigDecimal num1, BigDecimal num2){

//        if (num1 == null) num1 = BigDecimal.ZERO;
//        if (num2 == null) num2 = BigDecimal.ZERO;

        if (num1 == null || num2 == null) throw new BusinessException(GeneralErrorMessage.VALUES_CANNOT_BE_NULL);

        return num1.add(num2);
    }
}
