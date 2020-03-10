package com.exercises;

public class DaysOfTheWeek {
    private String[] daysOfWeek;

    public DaysOfTheWeek(String... daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public String[] getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public String longestDayInLetters(String[] daysOfWeek) {
        String dayWithMostCharacters = "";
        for (String day : daysOfWeek) {
            if (day.length() > dayWithMostCharacters.length())
                dayWithMostCharacters = day;
        }
        System.out.println("Day with the most number of characters " + dayWithMostCharacters);

        return dayWithMostCharacters;
    }

    public void daysInReverse (String[] daysOfWeek){
        for (int i=daysOfWeek.length -1; i>=0; i-- ){
            System.out.println(daysOfWeek[i]);
        }

    }

}




