package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = ((a + b + c)/2);
        double rs1 = p - a;
        double rs2 = p - b;
        double rs3 = p - c;
        double rs4 = p*rs1*rs2*rs3;
        double rs5 = Math.sqrt(rs4);
        return rs5;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
