package com.exercises;

import java.util.ArrayList;

public class Book {

    private int id;
    private String name;
    private String author;
    private ArrayList<ReviewBook> review = new ArrayList<>();

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<ReviewBook> getReview() {
        return review;
    }

    public void setReview(ArrayList<ReviewBook> review) {
        this.review = review;
    }

    public String toString() {
        return String.format("book ID - [%d]  name - [%s] author - [%s] Reviews [%s]", id, name, author, review);

    }

    public void addReview(ReviewBook reviewBook) {
        this.review.add(reviewBook);
    }
}
