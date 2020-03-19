package com.exercises;

public class GenericsRunner {
    public static void main(String[] args) {

        MyCustomList<Long> list = new MyCustomList();
        list.addElement(1l);
        list.addElement(4l);
        System.out.println(list);
        Long  value = list.get(0);
        System.out.println(value);


        MyCustomList<Integer> list2 = new MyCustomList();
        list2.addElement(Integer.valueOf(5));
        list2.addElement(Integer.valueOf(8));
        System.out.println(list2);
        Integer numberIndex = list2.get(0);
        System.out.println(numberIndex);
    }


}
