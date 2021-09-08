package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }

    public static void main(String[] args) {
        double result = Point.distance(1, 2, 3, 4);
        System.out.println(result);
        result = Point.distance(5, 6, 8, 9);
        System.out.println(result);
        result = Point.distance(9, 15, 17, 22);
        System.out.println(result);
        }
}
