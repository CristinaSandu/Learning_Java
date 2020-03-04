package com.exercises;

public class MotorBike {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public MotorBike(int speed) {   //Constructor. Nu are return type. Numele metodei este exact ca numele clasei.
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        if(speed>0)
        this.speed = speed;     //seteaza valoarea din aceasta clasa.
    }

    void move(){

        System.out.println("Bike moves");
    }

    public void increaseSpeed (int howMuch){
        setSpeed(this.speed+howMuch);
    }
    public void decreaseSpeed (int howMuch){
        setSpeed(this.speed-howMuch);
    }
}
