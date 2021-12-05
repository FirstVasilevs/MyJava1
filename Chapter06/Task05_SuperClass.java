package ru.ereshchenko.MyJava.Chapter06;

public class Task05_SuperClass {

    public static void hello() {
        System.out.println("Привет из суперкласса");
    }

    public static void echo(String arg) {
        try {
            System.out.println("Вы ввели: " + arg);
        } catch (Exception e) {
            System.out.println("Требуется аргумент");
        }
    }
}

class SubClass extends Task05_SuperClass {
    public static void main(String[] args) {

        hello();
        Task05_SuperClass.hello();
        try {
            echo(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Привет, нашел решение!");
        }

    }
    public static void hello() {
        System.out.println("Привет из подкласса");
    }
}