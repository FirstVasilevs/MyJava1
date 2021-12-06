package ru.ereshchenko.MyJava.Chapter07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task02_ReadString {

    private static Object BufferedReader;

    public static void main(String[] args) {

        System.out.print("Введите название данной книги: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader = new BufferedReader(isr);
        String input = "";
        try {
            java.io.BufferedReader buffer = null;
            input = buffer.readLine();
            buffer.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода");
        }
        System.out.println("\nСпасибо, вы читаете " + input);
    }
}
