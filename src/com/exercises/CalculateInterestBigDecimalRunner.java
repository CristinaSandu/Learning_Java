package com.exercises;

import java.math.BigDecimal;

public class CalculateInterestBigDecimalRunner {
    public static void main(String[] args) {
        CalculateInterestBigDecimal ci = new CalculateInterestBigDecimal(BigDecimal.valueOf(89.77),
                BigDecimal.valueOf(7));
        ci.calculator(5);
    }
}
//BigDecimal este o clasa, pentru ca are metode in ea.