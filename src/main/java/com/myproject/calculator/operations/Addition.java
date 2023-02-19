package com.myproject.calculator.operations;

public class Addition implements Operation {
    public int add(int a, int b) {
        return a+b;
    }
    public double addMultipleNumbers(double[] numbers){
        double value=0;
        for(double num:numbers){
            value+=num;
        }
        return value;
    }

    @Override
    public double calculate(double a, double b) {
        return a +b;
    }
}
