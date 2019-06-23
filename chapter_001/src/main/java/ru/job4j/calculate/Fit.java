package ru.job4j.calculate;

/**
 * Программа расчета идеального веса
 */
public class Fit {

    public static final int MAN_CONST = 100;
    public static final double INDEX = 1.15;
    public static final int WOMAN_CONST = 110;

    /**
     * Идеальный вес мужчины.
     * @param height рост.
     * @return идеальный вес.
     */
    public double menWeight(double height) {
        return (height - MAN_CONST) * INDEX;
    }

    /**
     * Идеальный вес женщины.
     * @param height рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return (height - WOMAN_CONST) * INDEX;
    }
}
