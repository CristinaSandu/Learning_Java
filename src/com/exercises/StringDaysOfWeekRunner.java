package com.exercises;

public class StringDaysOfWeekRunner {
    public static void main(String[] args) {
        String [] daysOfWeek={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        DaysOfTheWeek days=new DaysOfTheWeek(daysOfWeek);
        days.longestDayInLetters(daysOfWeek);
        days.daysInReverse(daysOfWeek);
    }
}
