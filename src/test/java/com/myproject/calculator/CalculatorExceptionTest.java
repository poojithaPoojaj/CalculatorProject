package com.myproject.calculator;

import org.testng.annotations.Test;

public class CalculatorExceptionTest {
    private Calculator calculator = new Calculator();

    @Test(expectedExceptions = ArithmeticException.class)
    public void divideByZeroTest() {
        calculator.divideNumbers(10,0);
    }
    @Test
    public void checkOutOfBoundsException(){
        calculator.divideMultipleNumbers(new double[]{1,2,3,4});
    }
}
