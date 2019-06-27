package ru.job4j.loop;

/**
 * @author Ruslan Yusov (ruslan0805@mail.ru).
 * @version $Id$.
 * @since 0.1.
 */
public class Counter {

    /**
     * Сумма простых чисел в определенном диапазоне.
     * @param start - начальное значение.
     * @param finish - конечное значение.
     * @return - сумма.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                continue;
            }
        }
        return sum;

    }
}