package com.codegym;


public class Main {

    public static void main(String[] args) {
        String[] array = {"Ruby", "Weiss", "Blake", "Yang"};
        System.out.println("-----Mảng ban đầu-----");
        for (String element : array) {
            System.out.println(element);
        }
        String[] newArray = addNewElementArray(array, 2, "Penny");
        System.out.println("-----Mảng sau khi thêm-----");
        for (String element : newArray) {
            System.out.println(element);
        }
    }

    public static String[] addNewElementArray(String[] array, int index, String value) {
        String[] newArray = new String[array.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else if (i == index) {
                newArray[i] = value;
            } else {
                newArray[i] = array[i - 1];
            }
        }
        return newArray;
    }
}
