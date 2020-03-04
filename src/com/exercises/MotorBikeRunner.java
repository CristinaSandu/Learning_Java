package com.exercises;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike honda = new MotorBike(100);   //Putem da valoarea ca parametru pentru ca avem Constructor.
        MotorBike ducati = new MotorBike(500);

        honda.move();
        ducati.move();
        honda.setSpeed(100);
        ducati.setSpeed(80);
        System.out.println("Honda " + honda.getSpeed());
//====================================================
        //Encapsulation level 2.
        int ducatiSpeed = ducati.getSpeed();//Get ducati speed
        ducatiSpeed = ducatiSpeed + 100;     //increase it by 100
        ducati.setSpeed(ducatiSpeed);        // set it to ducati


        int hondaSpeed = honda.getSpeed();//Get honda speed
        hondaSpeed = hondaSpeed + 100;     //increase it by 100
        honda.setSpeed(hondaSpeed);        // set it to honda

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

//==============cu metoda======================================
        ducati.increaseSpeed(50);
        honda.increaseSpeed(30);
        ducati.decreaseSpeed(10);
        honda.decreaseSpeed(20);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
    }
}
