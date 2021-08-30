package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rs1 = (x2 - x1);
        double rs2 = (y2 - y1);
        double rs3 = Math.pow(x2 - x1,2);
        double rs4 = Math.pow(y2 - y1,2);
        double rs3Plusrs4 = rs3 + rs4;
        double rs5 = Math.sqrt(rs3Plusrs4);
        return rs5;
        }

    public static void main(String[] args) {
        double result = Point.distance(1, 1, 5, 6);
        System.out.println(result);
        }
}
