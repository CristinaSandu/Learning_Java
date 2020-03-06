package com.exercises;

import java.util.Scanner;

public class WhileExercises {
    private int limit;

    public WhileExercises(int limit) {
        this.limit = limit;
    }

    public void printSqaresUpToLimit() {
        int i = 1;
        while (i * i < limit) {
            System.out.println(i * i);
            i++;
        }
    }

    public void printCubesUpToLimit() {
        int i = 1;
        while (i * i * i < limit) {
            System.out.println(i * i * i);
            i++;
        }


    }

    public void InsertDoWhileCubes() {

        int number1 = 0;
        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("The cube is " + (number1 * number1 * number1));
            System.out.println("Insert a number");
            number1 = scan.nextInt();

        } while (number1 >= 0);
        System.out.println("Thank you!");
    }
}

