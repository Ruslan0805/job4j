package ru.job4j.condition;

/**
 * SqArea
 *
 * @author Ruslan Yusov (ruslan0805@mail.ru)
 */
public class SqArea {
    /**
     * Вычисление площади прамоугольника.
     * @param p - периметр прямоугольника.
     * @param k - коэффициент.
     * @return вычисление площади
     */
    public int square(int p, int k) {
        int h = p / 2 / (k + 1);
        return (h * k) * h;
    }
}
