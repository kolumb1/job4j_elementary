package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        int x;
        switch (name) {
            case "Понедельник":
                x = 1;
                break;
            case "Monday":
                x = 1;
                break;
            default:
                x = -1;
                break;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(numberOfDay("Вторник"));
    }
}