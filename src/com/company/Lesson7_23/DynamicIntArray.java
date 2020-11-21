package com.company.Lesson7_23;

public class DynamicIntArray {

    private int[] array = new int[0];

    //add array one element
    public int[] add(int number) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = number;
        array = newArray;
        return array;
    }

    //add array
    public int[] addAll(int[] arr) {
        int count = 0;
        int arrayLenght = array.length;
        int[] newArray = new int[array.length + arr.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        for (int i = array.length; i < newArray.length; i++) {
            newArray[arrayLenght] = arr[count];
            count++;
            arrayLenght++;
        }
        array = newArray;
        return array;
    }

    //find the elent in array
    public boolean contains(int index) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {
                return true;
            }
        }
        return false;
    }

    //remove element in array
    public int[] remove(int index) {
        int[] newArray = new int[array.length - 1];
        int count = 0;

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index; i < newArray.length; i++) {
            newArray[i] = array[i + 1];
        }
        array = newArray;
        return array;
    }

    //to change elements in array
    public int[] swap(int number1, int number2) {
        int number3;
        number3 = array[number1];
        array[number1] = array[number2];
        array[number2] = number3;
        return array;
    }

    //return array.lenght
    public int size() {
        return array.length;
    }

    //sorting array
    public int[] sort() {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    //print array
    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
