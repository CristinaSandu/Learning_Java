package com.exercises;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Samsung", 1.0, "Blue");
//        fan.convertToString();
//        fan.switchON();
//        fan.switchOff();
//        fan.changeSpeed((byte) 3);
//        System.out.println(fan);
        System.out.println(fan);
        Fan fan2 = new Fan("Huawei", 12.0, "Blue");
        System.out.println(fan.equals(fan2));
    }

}
