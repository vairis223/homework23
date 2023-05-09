package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static BigDecimal areaOfCircle(BigDecimal radius) {
       BigDecimal pi = new BigDecimal(Math.PI);
       BigDecimal squareOfRadius = radius.multiply(radius);
       return pi.multiply(squareOfRadius);

    }

    static BigDecimal areaOfRectangle(BigDecimal length, BigDecimal width) {
        return length.multiply(width);
    }

    static BigDecimal areaOfTriangle(BigDecimal base, BigDecimal h) {
        BigDecimal half = new BigDecimal("0.5");
        return base.multiply(h).multiply(half);
    }
}
