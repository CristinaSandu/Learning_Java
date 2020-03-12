package com.exercises;

public class Fan {

    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }


    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed;  //1 to 5



    public void switchON() {
        this.isOn=true;
        changeSpeed((byte)5);
    }

    public void switchOff() {
        this.isOn=false;
        changeSpeed((byte)0);
    }

    public void changeSpeed(byte speed) {
        this.speed=speed;
    }

    public String convertToString() {
      return  String.format("make - %s, radius - %f, color  - %s, isON - %b, speed - %d", make, radius,color,isOn,
                speed);
    }
}
