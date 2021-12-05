package ru.ereshchenko.MyJava.Сhapter02;

public class Task07_Escape {

    public static void main(String[] args) {

        String header = "\n\tНЬЮ-ЙОРК ПРОГНОЗ НА 3 ДНЯ: \n";
        header += "\n\tДень\t\t\tМакс\tМин\t\tОсадки\n";
        header += "\t---\t\t\t\t----\t---\t\t----------\n";

        String forecast = "\tВоскресенье\t\t68F\t\t48F\t\tЯсно\n";
        forecast += "\tПонедельник\t\t69F\t\t57\t\tЯсно\n";
        forecast += "\tВторник\t\t\t71F\t\t50F\t\tОблачность\n";

        System.out.print(header + forecast);
    }
}
