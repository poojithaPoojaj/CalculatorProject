package com.myproject.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

        private Calculator calculator = new Calculator();

        @Test
        public void testAdd() {
            int result = calculator.add(1, 2);
            Assert.assertEquals(3,result);
        }

        @Test
        public void testSubtract() {
            int result = calculator.subtract(1, 2);
            Assert.assertEquals(-1,result);
        }

        @Test
        public void testMultiply() {
            int result = calculator.multiply(1, 2);
            Assert.assertEquals(2,result);
        }

        @Test
        public void testDivide() {
            int result = calculator.divide(4, 2);
            Assert.assertEquals(2,result);
        }
}