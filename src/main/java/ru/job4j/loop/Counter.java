package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int j = start; j <= finish; j++) {
            sum = sum + j;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 5));
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 2));
        System.out.println(sum(45, 1000));
        System.out.println(sum(5, 98));
        System.out.println(sum(7, 9));
        System.out.println(sum(34, 243));
        System.out.println(sum(66, 77));
    }
}