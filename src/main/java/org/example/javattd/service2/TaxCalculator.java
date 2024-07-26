package org.example.javattd.service2;


import org.example.javattd.model2.Itr1;
import org.example.javattd.model2.Itr2;
import org.example.javattd.model2.Itr3;
import org.example.javattd.model2.Itr4;

public class TaxCalculator {

    public double calculatorTax(Itr1 itr1){
        return itr1.income*0.10 ;
    }
    public double calculatorTax(Itr2 itr2){
        return itr2.income*0.15+ itr2.capitalGains*0.20 ;
    }
    public double calculatorTax(Itr3 itr3){
        return itr3.income*0.25 + itr3.capitalGains *0.30 + itr3.businessIncome*0.35;
    }
    public double calculatorTax(Itr4 itr4){
        return itr4.income*0.10 + itr4.capitalGains*0.20 + itr4.businessIncome*0.35 + itr4.otheIncome*0.30;
    }

}
