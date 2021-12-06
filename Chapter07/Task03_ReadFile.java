package ru.ereshchenko.MyJava.Chapter07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task03_ReadFile {

    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("Teacher.txt");
            BufferedReader buffer = new BufferedReader(file);
            String line = " ";
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }
            buffer.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка чтения");
        }
    }
}
