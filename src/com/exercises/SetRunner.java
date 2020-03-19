package com.exercises;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {
    public static void main(String[] args) {
        List<Character>characters=List.of('b', 'z', 'a', 'b', 'z', 'f');
        Set<Character> setList = new HashSet<>(characters);
        System.out.println(setList);   // set-ul le ia o singura data.



        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println(treeSet); // le printeaza o singura data dar si in ordine.
    }
}
