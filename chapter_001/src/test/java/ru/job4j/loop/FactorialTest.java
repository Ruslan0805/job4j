package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Ruslan Yusov (ruslan0805@mail.ru).
 * @version $Id$.
 * @since 0.1.
 */
public class FactorialTest {

    /**
     * Test n = 5.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial calc = new Factorial();
        int result = calc.calc(5);
        assertThat(result, is(120));
    }

    /**
     * Test n = 0.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial calc = new Factorial();
        int result = calc.calc(0);
        assertThat(result, is(1));
    }
}
