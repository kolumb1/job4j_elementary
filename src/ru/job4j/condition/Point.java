package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = x2 - x1;
        return rsl;
        }

    public static void main(String[] args) {
        double result = Point.distance(1, 1, 5, 5);
        System.out.println(result);
    }
}
