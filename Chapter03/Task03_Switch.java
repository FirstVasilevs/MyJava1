package ru.ereshchenko.MyJava.Chapter03;

public class Task03_Switch {

    public static void main(String[] args) {

        int month = 12, year = 2021, num = 31;

        switch ( month ) {
            case 4: case 6: case 9: case 11:
                num = 30;
            break;
            case 2:
                num = (year % 4 == 0) ? 29 : 28;
                break;
        }
        System.out.println(month + "/" + year + ": " + num + "дней");
    }
}
