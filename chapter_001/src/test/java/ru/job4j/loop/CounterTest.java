package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Ruslan Yusov (ruslan0805@mail.ru).
 * @version $Id$.
 * @since 0.1.
 */
public class CounterTest {

    /**
     * Test Counter.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter sum = new Counter();
        int result = sum.add(1, 10);
        assertThat(result, is(30));
    }
}
