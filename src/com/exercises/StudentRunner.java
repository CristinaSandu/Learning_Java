package com.exercises;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {
        int[] marks = {55, 25, 33, 100, 58, 49};
        Student student = new Student("Jara", marks);
        Student student1 = new Student("Japa", new int[]{1,2});
        Student student2 = new Student("Jiska", new int[]{1,2, 100, 44, 66});

        // Folosind Refactor -> inline
        //Student student1=new Student("Java", new int[] {55, 44, 99,1}); Dispare initializarea de sus si se pune ca
        // parametru.
        int number = student.getNumberOfMarks();
        System.out.println("Number of Marks " + number);
        int sum = student.getTotalSumOfMarks();
        System.out.println("Sum of All Marks " + sum);
        int maximumMark = student.getMaximumMark();
        System.out.println("Maximum Mark" + maximumMark);
        int minimumMark = student.getMinimumMark();
        System.out.println("Minimum Mark" + minimumMark);
        BigDecimal average = student.getAverageMarks();
        System.out.println("Average sum of Mark " + average);
    }

}
