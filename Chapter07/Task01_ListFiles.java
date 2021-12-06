package ru.ereshchenko.MyJava.Chapter07;

import java.io.File;

public class Task01_ListFiles {

    public static void main(String[] args) {

        File dir = new File("data");

        if(dir.exists()) {
            String[] files = dir.list();
            System.out.println(files.length + "  файлов найдено...");
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
            }
        } else {
            System.out.println("Каталог не найден.");

        }
    }
}
