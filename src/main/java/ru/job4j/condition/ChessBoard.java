package ru.job4j.condition;

import ru.job4j.calculator.MathFunc;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 >= 0
                && y1 >= 0
                && x2 >= 0
                && y2 >= 0
                && x1 <= 7
                && y1 <= 7
                && x2 <= 7
                && y2 <= 7
                && Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            rsl = Math.abs(x2 - x1);
        }
        return rsl;
    }

    public static void main(String[] args) {
        int a = way(7, 0, 0, 7);
        System.out.println(a);
    }
}