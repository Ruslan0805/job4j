package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Ruslan Yusov (ruslan0805@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class FitTesr {
    /**
     * Test manWeight.
     */
    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double result = fit.menWeight(180);
        assertThat(result, closeTo(92.0, 0.1));
    }

    /**
     * Test womanWeight.
     */
    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double result = fit.womanWeight(170);
        assertThat(result, closeTo(69.0, 0.1));
    }
}
