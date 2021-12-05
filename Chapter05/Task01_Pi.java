package ru.ereshchenko.MyJava.Chapter05;

public class Task01_Pi {

    public static void main(String[] args) {

        float radius = Float.parseFloat(args[0]);
        float shortPi = (float) Math.PI;

        float circ = shortPi * (radius + radius);
        float area = shortPi * (radius * radius);

        System.out.print("Если число Пи расчитано в диапазоне от " + Math.PI);
        System.out.println(" до " + shortPi + "...");
        System.out.println("Окружность с радиусом " + radius + " см");
        System.out.print("имеет длину " + circ + " см");
        System.out.println(" и площадь " + area + " кв.см");
    }
}
