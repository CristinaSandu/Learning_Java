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
        return String.format("name - []   Home adress - [] work adress - []" , name,homeAdress,workAdress);
    }
}
