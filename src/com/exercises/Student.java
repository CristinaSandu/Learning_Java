package com.exercises;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Student {
    private String name;
    private int[] listOfMarks;

    public Student(String name, int... listOfMarks) {   // Cand ai ... poti pune cate argumente vrei si se face
        // automat o lista cu ele. Deci o sa fie de tipul array. Se cheama Variable arguments si trebuie sa fie
        // intotdeauna ultimele
        this.name = name;
        this.listOfMarks = listOfMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getListOfMarks() {
        return listOfMarks;
    }

    public void setListOfMarks(int[] listOfMarks) {
        this.listOfMarks = listOfMarks;
    }
    //---------------------methods start here-------------------

    public int getNumberOfMarks() {
        return listOfMarks.length;
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int i = 0; i <= listOfMarks.length; i++) {
            sum = sum + i;
        }
        return sum;
    }

    //....................
    public int anotherMethodForSum() {
        int sum = 0;
        for (int mark : listOfMarks) {
            sum += mark;
        }
        return sum;
    }

    //..................
    public int getMaximumMark() {
        IntSummaryStatistics infos = Arrays.stream(listOfMarks).summaryStatistics();
        return infos.getMax();
    }

    public int getMinimumMark() {
        IntSummaryStatistics infos = Arrays.stream(listOfMarks).summaryStatistics();
        return infos.getMin();
    }

    public BigDecimal getAverageMarks() {
        IntSummaryStatistics infos = Arrays.stream(listOfMarks).summaryStatistics();
        return BigDecimal.valueOf(infos.getAverage());
    }
}

