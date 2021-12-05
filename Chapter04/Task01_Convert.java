package ru.ereshchenko.MyJava.Chapter04;

public class Task01_Convert {

    public static void main(String[] args) {

        float dayFloat = 365.25f;
        String weeksString = "52";

        int dayInt = (int) dayFloat;
        int weeksInt = Integer.parseInt(weeksString);

        int week = (dayInt / weeksInt);
        System.out.println("Дней в неделе: " + week);
    }
}
