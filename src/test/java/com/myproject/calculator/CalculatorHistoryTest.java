package com.myproject.calculator;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CalculatorHistoryTest {
    @Test
    public void testCalculatorHistory() {
        Calculator calculator = new Calculator();
         CalculatorHistory calculatorHistory=new CalculatorHistory();

         calculatorHistory.addCalculation(new Calculation("10 + 20",calculator.addNumbers(10,20)));
        calculatorHistory.addCalculation(new Calculation("100 - 20",calculator.subtractNumbers(100,20)));
        calculatorHistory.addCalculation(new Calculation("10 * 20",calculator.multiplyNumbers(10,20)));
        calculatorHistory.addCalculation(new Calculation("100 / 20",calculator.divideNumbers(100,20)));

        List<Calculation> calculationList=calculator.getHistory(calculatorHistory);
        Assert.assertEquals(4, calculationList.size());
        Assert.assertEquals("10 + 20 = 30",calculationList.get(0).getInput()+" = "+
                (int)calculationList.get(0).getResult());
       Assert. assertEquals("100 - 20 = 80",calculationList.get(1).getInput()+" = "+
               (int)calculationList.get(1).getResult());

       Assert. assertEquals("10 * 20 = 200",calculationList.get(2).getInput()+" = "+
               (int)calculationList.get(2).getResult());

        Assert.assertEquals("100 / 20 = 5", calculationList.get(3).getInput()+" = "+
                (int) calculationList.get(3).getResult());
    }
}
