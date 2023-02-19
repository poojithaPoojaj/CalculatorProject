package com.myproject.calculator.operations;

public class Subtraction {
    public int subtract(int a, int b) {
        return a-b;
    }

    public double subtractMultipleNumbers(double[] numbers){

        if(numbers.length==0)
        {
            return 0;
        }
        double value=numbers[0];

        for(int i=1;i<numbers.length;i++){
            value=value-numbers[i];
        }
        return value;
    }

}
