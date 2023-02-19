package com.myproject.calculator.operations;

public class Addition {
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
}
