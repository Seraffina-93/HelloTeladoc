package com.helloteladoc.api;

import com.helloteladoc.api.util.Calculator;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello Teladoc");
        Calculator calculator = new Calculator("0123", "11");
        System.out.println(calculator.addNumbers(calculator.getStr1(), calculator.getStr2()));
    }

}
