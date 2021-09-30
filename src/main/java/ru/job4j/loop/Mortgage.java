package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double x = 0;
        while (x >= 0) {
            x = amount + amount * percent / 100 - salary;
            amount = x;
            year++;
        }
        return year;
    }
}