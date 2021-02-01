package com.calculator.demo;

import com.calculator.demo.controller.CalculationUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculationUtilsTest {
    int x;
    int y;

    @Before
    public void setUp() {
        x = 4;
        y = 8;
    }

    @Test
    public void testAdd() {
        int result = 12;
        Assert.assertEquals("4 + 8 must be equal 12", result, CalculationUtils.add(x, y));
    }

    @Test
    public void testSub() {
        int result = -4;
        Assert.assertEquals("4 - 8 must be equal -4", result, CalculationUtils.sub(x, y));
    }
}
