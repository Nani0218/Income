package org.example.javattd.service2;

import org.example.javattd.model2.Itr1;
import org.example.javattd.model2.Itr2;
import org.example.javattd.model2.Itr3;
import org.example.javattd.model2.Itr4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxCalculatorTest {
    @Test
    public void  testItr1(){
        TaxCalculator taxItr = new TaxCalculator();
        Itr1 itr1 = new Itr1(500000,"software");
        double expectTax = 500000 * 0.10;
        double actualTax= taxItr.calculatorTax(itr1);
        Assertions.assertEquals(expectTax,actualTax);

    }
    @Test
    public void testItr2(){
        TaxCalculator taxItr2 = new TaxCalculator();
        Itr2 itr2 = new Itr2(50000,"gobOlder",500000);
        double expectTax = 50000 * 0.15 + 500000 * 0.20;
        double actualTax= taxItr2.calculatorTax(itr2);
        Assertions.assertEquals(expectTax,actualTax);
    }
    @Test
    public void testItr3(){
        TaxCalculator taxItr3 = new TaxCalculator();
        Itr3 itr3 = new Itr3(3000000,  "police",2000000,300000);
        double expectTax= 3000000 * 0.25 + 2000000*0.30 + 300000*0.35;
        double actualTax = taxItr3.calculatorTax(itr3);

        Assertions.assertEquals(expectTax,actualTax);
    }
    @Test
    public void testItr4() {
        TaxCalculator taxItr4 = new TaxCalculator();
        Itr4 itr4 = new Itr4(1100000,"youtuber",25000000,1800000,52000000);
        double expectTax = 1100000*0.10 + 25000000*0.20 + 1800000*0.35 + 52000000*0.30;
        double actualTax = taxItr4.calculatorTax(itr4);

        Assertions.assertEquals(expectTax,actualTax);

    }

}
