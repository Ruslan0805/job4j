package ru.job4j.calculate;

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
public class CalculateTest {
     /**
      * Test add.
     */
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculate calc = new Calculate();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test subtract.
     */
    @Test
    public void whenTwoSubtractOneThenOne()  {
        Calculate calc = new Calculate();
        double result = calc.subtract(2D, 1D);
        double expected = 1D;
        assertThat(result, is(expected));
    }
    /**
     * Test div.
     */
    @Test
    public void whenDivTwoOnTwoThenOne()  {
        Calculate calc = new Calculate();
        double result = calc.div(2D, 2D);
        double expected = 1D;
        assertThat(result, is(expected));
    }
    /**
     * Test multiple.
     */
    @Test
    public void whenMultipleOneOnOneThenOne()  {
        Calculate calc = new Calculate();
        double result = calc.multiple(1D, 1D);
        double expected = 1D;
        assertThat(result, is(expected));
    }
}