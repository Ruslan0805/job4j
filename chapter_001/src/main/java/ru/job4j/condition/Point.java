package ru.job4j.condition;
import static java.lang.Math.*;
/**
 * Point
 *
 * @author Ruslan Yusov (ruslan0805@mail.ru)
 */
public class Point {
    /**
     * Расчет растояния между точками в системе координат.
     * @param x1 - параметр 1 по оси х.
     * @param x2 - параметр 2 по оси х.
     * @param y1 - параметр 1 по оси у.
     * @param y2 - параметр 2 по оси у.
     * @return расстояние между точками.
     */
    public double distance(int x1, int x2, int y1, int y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }
}
