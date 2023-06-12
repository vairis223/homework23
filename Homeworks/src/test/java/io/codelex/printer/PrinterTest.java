package io.codelex.printer;


import io.codelex.oop.summary.generics.Printer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    @Test
    public void testPrintString(){
        Printer<String> printer = new Printer<>("Labdien!");
        assertEquals("Labdien!", printer.getThingToPrint());
    }
    @Test
    public void testPrintInteger() {
        Printer<Integer> printer = new Printer<>(25);
        assertEquals(Integer.valueOf(25), printer.getThingToPrint());
    }
    @Test
    public void testPrintDouble() {
        Printer<Double> printer = new Printer<>(5.25);
        assertEquals(String.valueOf(5.25), printer.getThingToPrint(), 0,455);
    }

}


