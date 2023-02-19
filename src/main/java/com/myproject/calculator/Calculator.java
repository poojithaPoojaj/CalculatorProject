package com.myproject.calculator;

import com.myproject.calculator.operations.*;

public class Calculator {

  public int addNumbers(int num1,int num2){
      return new Addition().add(num1,num2);
  }
    public int subtractNumbers(int num1,int num2){
        return new Subtraction().subtract(num1,num2);
    }
    public int multiplyNumbers(int num1,int num2){
        return new Multiplication().multiply(num1,num2);
    }

    public int divideNumbers(int num1,int num2){
        return new Division().divide(num1,num2);
    }


    public double addMultipleNumbers(double []numbers){
        return new Addition().addMultipleNumbers(numbers);
    }
    public double subtractMultipleNumbers(double []numbers){
        return new Subtraction().subtractMultipleNumbers(numbers);
    }
    public double multiplyMultipleNumbers(double []numbers){
        return new Multiplication().multiplyMultipleNumbers(numbers);
    }
    public double divideMultipleNumbers(double []numbers){
        return new Division().divisionMultipleNumbers(numbers);
    }

    public double performOperation(double a, double b, Operation operation) {
        return operation.calculate(a, b);
    }
}
