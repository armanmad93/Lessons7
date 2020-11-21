package com.company.Lesson7_18;

import java.util.ArrayList;
import java.util.Random;

public class Lesson7_18 {

    public static void main(String[] args) {

        //18 Design a class Product
        //    properties
        //        - title
        //        - price
        //        - rating
        //Create 10 product objects in main,
        //give them titles ,
        //random prices in range (50$ - 100&)  ,
        //and random ratings in range (0 - 10) and store them in an array (or ArrayList);
        //get the best rated product from the array and display the title.

        ArrayList<Properties> arrayList = new ArrayList<>();

        Random random = new Random();
        int maximum = 0;

        for (int i = 0; i < 10; i++) {
            Properties properties = new Properties(String.valueOf(i), random.nextInt(50) + 50, random.nextInt(10));
            arrayList.add(properties);
        }

        //find best rating
        for (int i = 0; i < arrayList.size(); i++) {
            if (maximum < arrayList.get(i).getRating()) {
                maximum = arrayList.get(i).getRating();
            }
        }

        //print titile in best Objects rating
        for (int i = 0; i < arrayList.size(); i++) {
            if (maximum == arrayList.get(i).getRating()) {
                System.out.println("raiting: " + arrayList.get(i).getRating() + " best titie is: " + arrayList.get(i).getTitle());
            }
        }

    }

}
