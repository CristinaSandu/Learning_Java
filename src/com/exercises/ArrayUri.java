package com.exercises;

import java.util.Arrays;

import static java.util.Arrays.*;

public class ArrayUri {
    public static void main(String[] args) {
        int[] marks = new int[5]; // asa se defineste un array. Vreau sa fac un array de integer-uri care sa aiba 5
        // valori.
        // la crearea array-lui este obligatoriu sa soecifici cate valori are array-ul

        System.out.println(marks[0]);   //Ce valoare o sa aiba prima positie din array => 0, pentru ca inca nu a fost
        // completata.
        marks[0]=10; //adaugam o valoare.
        marks[1]=20;
        marks[2]=55;
        marks[3] = 66;
        marks [4] = 78;

        //Sau mai usor si mai repede.

      int[]  marks2=  {77, 88, 85, 49,15 } ;


        System.out.println("Lungimea " + marks2.length);


        int[] arrayWithEightElements = {88,11,12,15,13,18,16, 87};
        for (Integer element:arrayWithEightElements) {
            System.out.println("elementul "  + element);

        }
        int[] array1 = {1,2,3};
        int[] array2= {1,2,4};
        System.out.println("Cele doua arrat-uri au aceleasi valori? " +   Arrays.equals(array1, array2));
        //returneaza true daca au acelasi numar de elemente si sunt identice
    }
}
