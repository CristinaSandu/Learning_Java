package com.exercises;

import java.util.HashMap;
import java.util.Map;

public class MapRUnner {
    public static void main(String[] args) {
        String str = "Some text. Some other text";
        Map<Character, Integer> occurence = new HashMap<>();

        char[] chars = str.toCharArray();

        for (Character chr : chars) {
            Integer integer = occurence.get(chr);
            if (integer == null) {
                occurence.put(chr, 1);

            } else {
                occurence.put(chr, integer + 1);
            }
        }
        System.out.println(occurence);

    }
}
