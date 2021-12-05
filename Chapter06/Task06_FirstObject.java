package ru.ereshchenko.MyJava.Chapter06;

public class Task06_FirstObject {

    public final static String color = "Красный";
    public final static String bodyType = "Купе";
    public static String accelerate() {

        String motion = "Ускоряется...";
        return motion;
    }
}

class FirstObject {

    public static void main(String[] args) {

        System.out.println("Цвет " + Task06_FirstObject.color);
        System.out.println("Тип кузова " + Task06_FirstObject.bodyType);
        System.out.println(Task06_FirstObject.accelerate());
    }
}
