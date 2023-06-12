package io.codelex.combiner.practice;


import java.math.BigDecimal;

import io.codelex.oop.summary.generics.Combiner;
import org.junit.Assert;
import org.junit.Test;
public class CombinerTest {
    @Test
    public void testCombineTwoItems() {
        Integer num = 10;
        BigDecimal decimal = new BigDecimal("10.5");
        String str = "Hello";

        String result1 = Combiner.combineTwoItems(num, decimal);
        Assert.assertEquals("First item: 10; Second item: 10.5", result1);

        String result2 = Combiner.combineTwoItems(str, decimal);
        Assert.assertEquals("First item: Hello; Second item: 10.5", result2);
    }


}
