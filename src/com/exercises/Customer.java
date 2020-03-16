package com.exercises;

public class Customer {

    private String name;
    private Adress homeAdress;
    private Adress workAdress;

    //creating


    public Customer(String name, Adress homeAdress) {
        this.name = name;
        this.homeAdress = homeAdress;
    }

    public Adress getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(Adress homeAdress) {
        this.homeAdress = homeAdress;
    }

    public Adress getWorkAdress() {
        return workAdress;
    }

    public void setWorkAdress(Adress workAdress) {
        this.workAdress = workAdress;
    }
    public String toString(){
        return String.format("name - [%s]   Home adress - [%s] work adress - [%s]" , name,homeAdress,workAdress);
    }
}
