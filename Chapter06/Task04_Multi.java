package ru.ereshchenko.MyJava.Chapter06;

public class Task04_Multi {

    public static void main(String[] args) {

        String msg = "Это локальная переменная класса Multi";
        System.out.println(msg);
        System.out.println(Data.txt);
        Data.greeting();
        Draw.line();
    }
}

class Data {

    public final static String txt = "Это глобальная переменная класса Data";

    public static void greeting() {
        System.out.print("Это глобальный метод ");
        System.out.println("класса Data");
    }
}

class Draw {

    static void line() {
        System.out.println("____________________");
    }
}
