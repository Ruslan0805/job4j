package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Ruslan Yusov (ruslan0805@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class ConverterTest {

    /**
     * Test converter rubleToEvro.
     */
    @Test
    public void whenRubleToEvro() {
        Converter converter = new Converter();
        int result = converter.rubleToEvro(70);
        assertThat(result, is(1));
    }

    /**
     * Test converter rubleToDollar.
     */
    @Test
    public void whenRubleToDollar() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    /**
     * Test converter evroToRuble.
     */
    @Test
    public void whenEvroToRuble() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1);
        assertThat(result, is(70));
    }

    /**
     * Test converter dollarToRuble.
     */
    @Test
    public void whenDollarToRuble() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(1);
        assertThat(result, is(60));
    }
}
