package ru.job4j.condition;

/**
 * @author Ruslan Yusov (ruslan0805@mail.ru).
 * @version $Id$.
 * @since 0.1.
 */
public class MultiMax {

    /**
     * Нахождение максимума из трех чисел.
     * @param first - первое число.
     * @param second - второе число.
     * @param third - третье число.
     * @return максимум.
     */
    public int max(int first, int second, int third) {
        int result;
        result = first >= second ? first : second;
        result = result >= third ? result : third;
        return result;
    }
}
