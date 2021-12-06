package ru.ereshchenko.MyJava.Chapter07;

import java.util.Arrays;

public class Task05_Sort {

    public static void main(String[] args) {

        String[] names = {"John", "Mike", "Anna"};
        int[] nums = {200, 300, 100};

        dicplay(names);
        dicplay(nums);

        Arrays.sort(names);
        Arrays.sort(nums);

        dicplay(names);
        dicplay(nums);

    }

    public static void dicplay(String[] elems) {
        System.out.println("\nСтроковый массив: ");
        for (int i = 0; i < elems.length; i++) {
            System.out.println("Элемент " + i + " - " + elems[i]);
        }
    }

    public static void dicplay(int[] elems) {
        System.out.println("\nЦелочисленный массив: ");
        for (int i = 0; i < elems.length; i++) {
            System.out.println("Элемент " + i + " - " + elems[i]);
        }
    }

}
