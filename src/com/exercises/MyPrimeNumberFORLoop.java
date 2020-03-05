package com.exercises;

public class MyPrimeNumberFORLoop {
    private int number;

    public MyPrimeNumberFORLoop(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        //2 to number-1

        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void printNumberTriangle() {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " " );
            }
            System.out.println();
        }
    }
}

