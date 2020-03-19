package com.exercises;

import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
        List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);

        printEithFP(list);
        printBasicWithFiltering(list);
        sumNumbersInAList(numbers);
    }

    private static void printBasic(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

    private static void printEithFP(List<String> list) {
        list.stream().forEach(element -> System.out.println(element));
    }

    private static void printBasicWithFiltering(List<String> list) {   //sa printeze doar cuvintele care se termina
        // in at
        list.stream().
                filter(
                        element -> element.endsWith("at")).
                forEach(
                        element -> System.out.println(element));
    }

    private static void sumNumbersInAList(List<Integer> numbers) {
        int sum = numbers.stream().
                filter(number -> number % 2 == 1)     //insumeaza doar numerele impare
                .reduce(
                        0, (number1, number2) -> number1 + number2);

        System.out.println(sum);
    }
}