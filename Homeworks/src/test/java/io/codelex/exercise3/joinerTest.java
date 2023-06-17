package io.codelex.exercise3;

import io.codelex.praktiskaisdarbs.exercise3.Joiner;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class joinerTest {

    @Test
    public void testIntegerJoiner() {
        Joiner<Integer> integerJoiner = new Joiner<>("-");
        String result = integerJoiner.join(1, 2, 3, 4);
        assertEquals("1-2-3-4",result);
    }
}
