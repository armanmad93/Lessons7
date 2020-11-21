package com.company.Lesson7_19;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //19. Design a class User
        //    properties
        //        - username
        //        - password
        //        - role ( String(or enum) -> ADMIN, CUSTOMER)
        //Password should contain at least one uppercase character at least 3 numbers and at least one
        //special character (“#”, “!”, or “%”) . If password is not valid, do not set it to user
        //Create 10 users in main,
        //2 administrators and 8 customers
        //Store them in an array (or ArrayList)

        ArrayList<Properties> arrayList = new ArrayList<>();
        Roles myAdmin = Roles.ADMIN;
        Roles myCustomer = Roles.CUSTOMER;

        arrayList.add(new Properties("Arman", "Arman!2020", String.valueOf(myAdmin)));
        arrayList.add(new Properties("Suren", "Suren#2020", String.valueOf(myAdmin)));
        arrayList.add(new Properties("Eva", "Eva@2020", String.valueOf(myCustomer)));
        arrayList.add(new Properties("Ani", "Ani2020", String.valueOf(myCustomer)));
        arrayList.add(new Properties("Innesa", "Innesa%2020", String.valueOf(myCustomer)));

        Rules rules = new Rules();

        for (int i = 0; i < arrayList.size(); i++) {
            if (!rules.isVald(arrayList.get(i).getPassword())) {
                arrayList.get(i).setPassword("null");
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + 1 + ".");
            System.out.println("Name: " + arrayList.get(i).getName());
            System.out.println("Password: " + arrayList.get(i).getPassword());
            System.out.println("Role: " + arrayList.get(i).getRole());
            System.out.println("-----");
        }
    }

}
