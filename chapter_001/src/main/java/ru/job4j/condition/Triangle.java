package ru.job4j.condition;
import static java.lang.Math.*;

/**
 * @author Ruslan Yusov (ruslan0805@mail.ru).
 * @version $Id$.
 * @since 0.1.
 */
public class Triangle {

    /**
     * Метод вычисления полупериметра по длинам сторон.
     * @param a расстояние между точками a b.
     * @param b расстояние между точками a c.
     * @param c расстояние между точками b c.
     * @return полупериметр.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Вероятность существования треуголька с заданными параметрами.
     * @param a длинна от точки a b.
     * @param b длинна от точки a c.
     * @param c длинна от точки b c.
     * @return определение сущестования треугольника.
     */
    private boolean exist(double a, double b, double c) {
        if ((a < (b + c)) && (b < (a + c)) && (c < (b + c))) {
            return true;
        }
        return false;

    }

    /**
     * Вычисление площади треугольника.
     * @param x1 параметр 1 по оси х.
     * @param y1 параметр 1 по оси у.
     * @param x2 параметр 2 по оси х.
     * @param y2 параметр 2 по оси у.
     * @param x3 параметр 3 по оси х.
     * @param y3 параметр 3 по оси у.
     * @return площадь треугольника.
     */
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rls = -1;
        double a = new Point().distance(x1, y1, x2, y2);
        double b = new Point().distance(x2, y2, x3, y3);
        double c = new Point().distance(x1, y1, x3, y3);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rls = sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rls;
    }
}
