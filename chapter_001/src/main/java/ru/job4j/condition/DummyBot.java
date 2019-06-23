package ru.job4j.condition;

/**
 * @author Ruslan Yusov (ruslan0805@mail.ru).
 * @version $Id$.
 * @since 0.1.
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param qwestion вопрос клиета.
     * @return ответ.
     */
    public String answer(String qwestion) {
        String rls = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(qwestion)) {
            rls = "Привет, умник.";
        } else if ("Пока.".equals(qwestion)) {
            rls = "До скорой встречи.";
        }
       return rls;
    }
}
