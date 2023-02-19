package com.myproject.calculator.operations;

public class Multiplication implements Operation{

    public int multiply(int a, int b) {
        return a*b;
    }

    public double multiplyMultipleNumbers(double[] numbers){
        double value=1;
        for(double num:numbers){
            value*=num;
        }
        return value;
    }
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
