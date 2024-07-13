package org.company.ExercisesUdemiTwoEightMine.Formula;

import java.math.BigDecimal;

public class SimplecalculatorRunner {
    public static void main(String[] args) {
        Simplecalculator simplecalculator = new Simplecalculator("4700", "1560");

        BigDecimal totalValue = simplecalculator.calculateTotalValue(5);

        System.out.println(totalValue);
    }
}
