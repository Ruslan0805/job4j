package ru.job4j.loop;

/**
 * @author Ruslan Yusov (ruslan0805@mail.ru).
 * @version $Id$.
 * @since 0.1.
 */
public class Board {

    public static final char CEIL_BLACK = 'X';
    public static final char CEIL_WHITE = ' ';

    /**
     * Генерировать строку из чередующихся символов.
     *
     * @param symbolEven четные символы, начиная с нуля.
     * @param symbolOdd  нечетные символы.
     * @param width длина строки.
     * @return строка чередующихся символов.
     */
    private String writeLine(char symbolEven, char symbolOdd, int width) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < width; i++) {
            if (i % 2 == 0) {
                res.append(symbolEven);
            } else {
                res.append(symbolOdd);
            }
        }
        return res.toString();
    }

    /**
     * Генерировать строки с имитацией шахматной доски.
     *
     * @param width  ширина доски.
     * @param height высота доски.
     * @return строка с чередующимис символами.
     */
    public String paint(int width, int height) {
        StringBuilder res = new StringBuilder();
        String ln = System.lineSeparator();
        String even = writeLine(CEIL_BLACK, CEIL_WHITE, width);
        String odd = writeLine(CEIL_WHITE, CEIL_BLACK, width);
        for (int j = 0; j < height; j++) {
            if (j % 2 == 0) {
                res.append(even);
            } else {
                res.append(odd);
            }
            res.append(ln);
        }
        return res.toString();
    }
}
