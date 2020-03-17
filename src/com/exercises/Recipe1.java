package com.exercises;

public class Recipe1 extends AbstractRecipe {
    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Get the ustensils");
    }

    @Override
    void doTheDish() {
        System.out.println("Do the dish");
    }

    @Override
    void cleanup() {
        System.out.println("Cleanup the ustensils");

    }
}
