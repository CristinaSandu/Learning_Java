package com.exercises;

public class PrimitiveNumbers {
   private int number1;
   private int number2;


    public PrimitiveNumbers(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    void add(){
        System.out.println("Add " + (this.getNumber1()+this.getNumber2()));
    }

    void multiply(){
        System.out.println("Multiply " + (this.getNumber1()*this.getNumber2()));
    }
    void doubleNumbers(){
        System.out.println("Double first " + (this.getNumber1()*this.getNumber1()) + "  Second " + (this.getNumber2()*this.getNumber2()));

    }
}
