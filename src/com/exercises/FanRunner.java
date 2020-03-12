package com.exercises;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Samsung", 12.0, "Blue");
        fan.convertToString();
        fan.switchON();
        fan.switchOff();
        fan.changeSpeed((byte) 3);
        System.out.println(fan);
    }

}
