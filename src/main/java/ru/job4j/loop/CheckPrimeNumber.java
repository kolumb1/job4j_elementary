package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        }
        for (int x = 2; x < number; x++) {
            if (number % 2 == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
