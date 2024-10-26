package org.company.ExercisesUdemiTwoEightMine.Formula;

import java.math.BigDecimal;

public class Simplecalculator {
    BigDecimal principal;

    BigDecimal interest;

    public Simplecalculator(String principial, String interest) {
        this.principal = new BigDecimal(principial);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int noOfYears) {

        BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
        BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(noOfYearsBigDecimal));

        return totalValue;
    }
}
