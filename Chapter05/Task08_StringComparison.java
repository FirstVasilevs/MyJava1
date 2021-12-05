package ru.ereshchenko.MyJava.Chapter05;

public class Task08_StringComparison {

    public static void main(String[] args) {

        String password = "bingo";
        try {
        } catch (Exception e) {
            System.out.println("Требуется ввод пароля.");
        }
        if (args[0].toLowerCase().equals(password)) {
            System.out.println("Пароль подтвержден.");
        } else {
            System.out.println("Неверный пароль.");
        }
    }
}
