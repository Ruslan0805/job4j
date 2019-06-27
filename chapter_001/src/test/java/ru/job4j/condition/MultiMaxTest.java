package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Ruslan Yusov (ruslan0805@mail.ru).
 * @version $Id$.
 * @since 0.1.
 */
public class MultiMaxTest {
    /**
     * Test max
     */
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
}
