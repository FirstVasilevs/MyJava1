package ru.ereshchenko.MyJava.Chapter04;

public class Task03_Option {

    public static void main(String[] args) {

        if (args[0].equals("-en")) {
            System.out.println("Опция английского языка");
        } else if (args[0].equals("-es")) {
            System.out.println("Опция для испанского языка");
        } else
            System.out.println("Неизвестная опция");
    }
}
