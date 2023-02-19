package com.myproject.calculator;

import com.myproject.calculator.operations.Addition;
import com.myproject.calculator.operations.Division;
import com.myproject.calculator.operations.Multiplication;
import com.myproject.calculator.operations.Subtraction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

        private Calculator calculator = new Calculator();

        @Test
        public void testAdd() {
            int result = calculator.addNumbers(1, 2);
            Assert.assertEquals(3,result);
        }

        @Test
        public void testSubtract() {
            int result = calculator.subtractNumbers(1, 2);
            Assert.assertEquals(-1,result);
        }

        @Test
        public void testMultiply() {
            int result = calculator.multiplyNumbers(1, 2);
            Assert.assertEquals(2,result);
        }

        @Test
        public void testDivide() {
            int result = calculator.divideNumbers(4, 2);
            Assert.assertEquals(2,result);
        }

        @Test
    public void addMultipleNumbers(){
            double result=calculator.addMultipleNumbers(new double[]{1,2,3,4,5});
            Assert.assertEquals(Double.valueOf(15),result);
        }
    @Test
    public void subtractMultipleNumbers(){
        double result=calculator.subtractMultipleNumbers(new double[]{5,4});
        Assert.assertEquals(Double.valueOf(1),result);
    }
    @Test
    public void multiplyMultipleNumbers(){
        double result=calculator.multiplyMultipleNumbers(new double[]{1,2,5});
        Assert.assertEquals(Double.valueOf(10),result);
    }
    @Test
    public void divideMultipleNumbers(){
        double result=calculator.divideMultipleNumbers(new double[]{10,5});
        Assert.assertEquals(2.0,result);
    }
    @Test
    public void checkingInterfaceImplementation(){

            Assert.assertEquals(Double.valueOf(10),calculator.performOperation(5,5,new Addition()));
            Assert.assertEquals(Double.valueOf(0),calculator.performOperation(5,5,new Subtraction()));
        Assert.assertEquals(Double.valueOf(25),calculator.performOperation(5,5,new Multiplication()));
        Assert.assertEquals(Double.valueOf(1),calculator.performOperation(5,5,new Division()));

    }
}