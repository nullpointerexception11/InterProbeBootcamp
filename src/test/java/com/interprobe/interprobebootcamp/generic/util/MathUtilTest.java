package com.interprobe.interprobebootcamp.generic.util;

import com.interprobe.interprobebootcamp.generic.enums.GeneralErrorMessage;
import com.interprobe.interprobebootcamp.generic.exceptions.BusinessException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author theLostCode
 * @Date 7/6/2022
 */
class MathUtilTest {

    @Test
    void shouldSum() {

        BigDecimal num1 = BigDecimal.valueOf(2);
        BigDecimal num2 = BigDecimal.valueOf(2);

        BigDecimal result = MathUtil.sum(num1, num2);

        Assertions.assertEquals(BigDecimal.valueOf(4), result);
    }

    @Test
    void shouldNotSumWhenNum1IsNull() {

        BigDecimal num1 = null;
        BigDecimal num2 = BigDecimal.valueOf(2);

        BusinessException businessException = assertThrows(BusinessException.class, () -> MathUtil.sum(num1, num2));

        assertEquals(GeneralErrorMessage.VALUES_CANNOT_BE_NULL, businessException);
    }

    @Test
    void shouldSumWhenValuesAreZero() {

        BigDecimal num1 = BigDecimal.ZERO;
        BigDecimal num2 = BigDecimal.ZERO;

        BigDecimal result = MathUtil.sum(num1, num2);

        Assertions.assertEquals(BigDecimal.ZERO, result);
    }

    @Test
    void shouldSumWhenValuesAreNegative() {

        BigDecimal num1 = BigDecimal.valueOf(-3);
        BigDecimal num2 = BigDecimal.valueOf(-5);

        BigDecimal result = MathUtil.sum(num1, num2);

        Assertions.assertEquals(BigDecimal.valueOf(-8), result);
    }

    @Test
    void shouldSumWhenValuesHaveDecimalDigit() {

        BigDecimal num1 = BigDecimal.valueOf(3.99);
        BigDecimal num2 = BigDecimal.valueOf(5.11);

        BigDecimal result = MathUtil.sum(num1, num2);

        Assertions.assertEquals(new BigDecimal("9.10"), result);
    }
}