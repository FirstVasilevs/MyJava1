package ru.ereshchenko.MyJava.Chapter06;

public class Task01_Methods {

    public static void main(String[] args) {

        System.out.println("Сообщение из главного метода.");
        sub();
    }

    private static void sub() {
        System.out.println("Сообщение из метода sub.");
    }
}
