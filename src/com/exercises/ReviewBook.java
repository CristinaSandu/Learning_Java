package com.exercises;

public class ReviewBook {
    private int id;
    private String description;
    private double rating;

    public ReviewBook(int id, String description, double rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public String toString() {
        return String.format("book ID - [%d]  description - [%s] rating - [%f]", id, description, rating);

    }
}
