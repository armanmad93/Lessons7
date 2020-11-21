package com.company.ArrayListLessons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ArrayListLessons {

    public static void main(String[] args) {

        //1. create a new arrayList, add some colors (string) and print out the collection
        //2. iterate through all elements in a arrayList
        //3. insert an element into the array list at the first position.
        //4. retrieve an element (at a specified index) from a given array list.
        //5. update specific array element by given element.
        //6. remove the third element from a arrayList.
        //7. search an element in a arrayList.
        //8. sort a given arrayList.
        //9. copy one arrayList into another.
        //11. reverse elements in a arrayList.
        //12. compare two arrayLists.
        //13. Write a program to swap two elements in an arrayList.
        //14. join two arrayLists.
        //15. empty an arrayList.
        //16. test an array list is empty or not.
        //17. replace the second element of the ArrayList with the specified element.


        //1.
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("green");
        arrayList.add("yellow");
        arrayList.add("red");
        arrayList.add("black");
        arrayList.add("white");
        System.out.println(arrayList);

        //2.
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + ", ");
        }
        System.out.println();

        //3.
        arrayList.add(0, "gray");
        System.out.println(arrayList);

        //4.
        String color = arrayList.get(2);
        System.out.println(color);

        //5.
        arrayList.set(2, "YELLO");
        System.out.println(arrayList);

        //6.
        arrayList.remove(3);
        System.out.println(arrayList);

        //7.
        System.out.println(arrayList.indexOf("black"));

        //8.
        Collections.sort(arrayList);
        System.out.println(arrayList);

        //9.
        ArrayList copyToArrayList = arrayList;
        System.out.println(copyToArrayList);

        //11.
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        //12.
        boolean equals = arrayList.equals(copyToArrayList);
        System.out.println(equals);

        //13.
        Collections.swap(arrayList, 2, 4);
        System.out.println(arrayList);

        //14.
        arrayList.addAll(copyToArrayList);
        System.out.println(arrayList);

        //15.
        arrayList.clear();
        System.out.println(arrayList);

        //16.
        boolean empty = arrayList.isEmpty();
        System.out.println(empty);

        //17.
        arrayList.add("red");
        arrayList.add("black");
        arrayList.add("white");
        arrayList.set(arrayList.size() - 1, "green");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }

    }

}
