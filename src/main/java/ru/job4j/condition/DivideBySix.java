package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0) {
            if (number % 2 == 0) {
                rsl = "Исходное число делится на 6.";
                System.out.println(rsl);
            } else {
                rsl = "Исходное число делится на 3, но не является четным.";
                System.out.println(rsl);
            }
        } else {
            if (number % 2 == 0) {
                rsl = "Исходное число не делится на 3, но является четным.";
                System.out.println(rsl);
            } else {
                rsl = "Исходное число не делится на 3 и не является четным.";
                System.out.println(rsl);
            }
        }
        return rsl;
    }

    public  static void main(String[] args) {
        DivideBySix.checkNumber(34);
    }
}