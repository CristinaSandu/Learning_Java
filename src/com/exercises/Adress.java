package com.exercises;

public class Adress {

    private String line1;
    private String city;
    private String zip;


    public Adress(String line1, String city, String zip) {
        super();
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }

    public String toString(){
        return line1 + " " + city + " " + zip;
    }
}
