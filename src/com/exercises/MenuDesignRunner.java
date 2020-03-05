package com.exercises;

import java.util.Scanner;

public class MenuDesignRunner {
    public static void main(String[] args) {
        Calculator();
        //isWorkingDay(6);

    }


    public static void Calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number ");
        int number1 = scanner.nextInt();

        System.out.println("Insert second number ");
        int number2 = scanner.nextInt();

        System.out.println("Your numbers are " + number1 + " and " + number2);

        System.out.println("Choose an operation: \n 1- Add \n 2- Substract \n 3- Divide \n 4- Multiply");
        int choice = scanner.nextInt();
        long result = 0;

        switch (choice) {
            case 1:
                result = number1 + number2;
                System.out.println("The result is: " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("The result is: " + result);
                break;
            case 3:
                result = number1 / number2;
                System.out.println("The result is: " + result);
                break;
            case 4:
                result = number1 * number2;
                System.out.println("The result is: " + result);
                break;
            default:
                System.out.println("Incorrect number");
                break;
        }
    }

    public static boolean isWorkingDay(int DayNumber) {

        boolean result = false;
        switch (DayNumber) {
            case 0:
                result = true;
                System.out.println("is week-end! ");
                break;
            case 1:
                result = false;
                System.out.println("go to work!");
                break;
            case 2:
                result = false;
                System.out.println("go to work!");
                break;
            case 3:
                result = false;
                System.out.println("go to work!");
                break;
            case 4:
                result = false;
                System.out.println("go to work!");
                break;
            case 5:
                result = false;
                break;
            case 6:
                result = true;
                System.out.println("is week-end! ");
                break;
            default:
                System.out.println("Incorrect number");
                break;

        }

        return result;

    }
}


