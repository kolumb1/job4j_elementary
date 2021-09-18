package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int j = start; j <= finish; j++) {
            sum = sum + j;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int j = start; j <= finish; j++) {
            if (j % 2 == 0) {
                sum = sum + j;
            }
        }
        return sum;
    }
}