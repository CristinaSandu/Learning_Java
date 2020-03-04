package com.exercises;

public class PrimitiveNumbersRunner {
    public static void main(String[] args) {
        PrimitiveNumbers pn = new PrimitiveNumbers(50, 20);
        pn.add();
        pn.multiply();
        pn.doubleNumbers();
        System.out.println(pn.getNumber1());
        System.out.println(pn.getNumber2());
    }
}
