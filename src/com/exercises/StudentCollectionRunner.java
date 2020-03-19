package com.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollectionRunner {
    public static void main(String[] args) {
        List<StudentCollection> students = List.of(new StudentCollection("A", 1),
                new StudentCollection("D", 4),
                new StudentCollection("W", 22));
        System.out.println(students);


        //transformam in Array list
        List<StudentCollection> studentCollectionsArrayList = new ArrayList<>(students);

    }


}
