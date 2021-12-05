package ru.ereshchenko.MyJava.Chapter03;

public class Task01_If {

    public static void main(String[] args) {

        int num = 8;

        if (5 > 1) System.out.println("Пять больше, чем один.");
        if ( 2 < 4 ) {
            System.out.println("Два меньше четырех.");
            System.out.println("Проверка выполнена успешно.");
        }
        if ((( num > 5) && (num < 10)) || (num == 12))
            System.out.println("Число в диапазоне от 6 до 9 включительно или равно 12");
    }
}
