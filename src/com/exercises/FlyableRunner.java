package com.exercises;

public class FlyableRunner {
    public static void main(String[] args) {
        Flyable[] flyingObject = {new Birds(), new Aeroplane()};
        for (Flyable object : flyingObject) {
            object.fly();
        }
    }
}
