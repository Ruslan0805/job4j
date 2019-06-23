package ru.job4j.converter;

/**
 * Конвертор валюты
 * @author Ruslan Yusov
 */
public class Converter {

    public static final int RATE_RUB_TO_EURO = 70;
    public static final int RATE_RUB_TO_DOLLAR = 60;

    /**
     * Конвертор рубли в евро.
     * @param value Рубль.
     * @return Евро.
     */
    public int rubleToEvro(int value) {
        return value / RATE_RUB_TO_EURO;
    }

    /**
     * Конвертор рубли в доллары.
     * @param value Рубль.
     * @return Доллар.
     */
    public int rubleToDollar(int value) {
        return value / RATE_RUB_TO_DOLLAR;
    }

    /**
     * Конвертор евро в рублию
     * @param value Евро.
     * @return Рубль.
     */
    public int euroToRuble(int value) {
        return value * RATE_RUB_TO_EURO;
    }

    /**
     * Конвертор доллары в рубли.
     * @param value Доллар.
     * @return Рубль.
     */
    public int dollarToRuble(int value) {
        return value * RATE_RUB_TO_DOLLAR;
    }
}
