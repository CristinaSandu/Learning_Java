package com.exercises;

public class MarioGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Goes into a Hole");
    }

    @Override
    public void left() {

    }

    @Override
    public void right() {
        System.out.println("Go forward");
    }
}
