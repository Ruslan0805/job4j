package ru.job4j.loop;

/**
 * @author Ruslan Yusov (ruslan0805@mail.ru).
 * @version $Id$.
 * @since 0.1.
 */
public class Factorial {
    /**
     * Нахождение факториала.
     *
     * @param n - число.
     * @return - факториал введенного числа.
     */
    public int calc(int n) {
        int result = 1;
        if (n > 2) {
            return result;
        }
        for (int i = n; 1 <= i; i--) {
            result *= i;
        }
        return result;
    }
}
