package ru.ereshchenko.MyJava.Сhapter02;

public class Task06_Precedence {

    public static void main(String[] args) {

        int sum = 32 - 8 + 16 * 2; // 16 * 2 = 32, + 24 = 56
        System.out.println("Порядок действий по умолчанию: " + sum);

        sum = (32 - 8 + 16) * 2; // 24 + 16 = 40, * 2 = 80
        System.out.println("Указанный порядок действий: " + sum);

        sum = (32 - (8 + 16)) * 2; // 32 - 24 = 8, * 2 = 16
        System.out.println("Спецфичный порядок действий " + sum);
    }
}
