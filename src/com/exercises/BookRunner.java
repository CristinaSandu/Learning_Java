package com.exercises;

import java.util.ArrayList;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book(1, "Amintiri din copilarie", "Ion Creanga");
        book.addReview(new ReviewBook(10, "Awesome", 5.00));
        book.addReview(new ReviewBook(11, "Borring", 1.00));
        System.out.println(book);
    }
}
