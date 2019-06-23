package ru.job4j.condition;

/**
 * @author Ruslan Yusov (ruslan0805@mail.ru).
 * @version $Id$.
 * @since 0.1.
 */
public class Max {
    /**
     * Вычисление максимального числа.
     * @param left число 1.
     * @param right число 2.
     * @return максимальное число.
     */
    public int max(int left, int right) {
        int result;
        result = left >= right ? left : right;
        return result;
    }
}
