package com.exercises;

public class MyPrimeNumberFORLoopRunner {
    public static void main(String[] args) {
        MyPrimeNumberFORLoop number = new MyPrimeNumberFORLoop(11);
        boolean isPrime=number.isPrime();
        System.out.println("isPrime " + isPrime);

        number.printNumberTriangle();
    }
}
