package com.exercises;

public class FirstExercise {

    public void multiplication(int number, int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.println(multiplication(number, i));
        }


    }
    public String multiplication(int number1, int number2) {
        return number1 + " * " + number2 + " = " + (number1 * number2);
    }

    public int sumExercise(int a, int b, int c){
        System.out.println(a+b+c);
        return (a+b+c);
    }
    public int thirdangle(int a, int b){
        int c=(180-a-b);
        if (a+b+c>180|| a<0||b<0 || c<0){
            System.out.println("Not a triangle");
        } else
            System.out.println("The third angle " + c);
        return c;
    }


}
