package com.exercises;

public class CustomerRunner {
    public static void main(String[] args) {
        Adress homeAdress = new Adress("Iasi", "Iasi", "000111222");
        Customer customer = new Customer("Ira", homeAdress);
        System.out.println(customer);


        Adress workAdress = new Adress("Cluj", "Cluj", "112233");
        customer.setWorkAdress(workAdress);
        System.out.println(customer);


    }
}
