package com.company.Lesson7_23;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //23
        //    DynamicIntArray dynamicIntArray = new DynamicIntArray();
        //    dynamicIntArray.add(1);
        //    dynamicIntArray.addAll(arrayToAdd); // int[]
        //    dynamicIntArray.contains(4);
        //    dynamicIntArray.remove(2); // index
        //    dynamicIntArray.swap(1, 8);
        //    dynamicIntArray.size();
        //    dynamicIntArray.sort();
        //    dynamicIntArray.print();

        DynamicIntArray array = new DynamicIntArray();
        array.add(5);
        array.add(2);
        array.add(4);
        array.add(10);
        array.add(8);
        array.print();
        System.out.println();

        int[] newArray = new int[3];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        array.addAll(newArray);
        array.print();
        System.out.println();

        if (array.contains(10)) {
            System.out.println("this element in array");
        } else {
            System.out.println("can't find this element");
        }

        array.remove(3);
        array.print();
        System.out.println();
        array.remove(4);
        array.print();

        array.swap(0, 4);
        System.out.println();
        array.print();

        System.out.println();
        System.out.println("lenght: " + array.size());

        array.sort();
        array.print();

    }

}
