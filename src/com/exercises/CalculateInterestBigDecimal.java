package com.exercises;

import java.math.BigDecimal;

public class CalculateInterestBigDecimal {
    private BigDecimal principal;
    private BigDecimal interest;

    public CalculateInterestBigDecimal(BigDecimal principal, BigDecimal interest) {
        this.principal = principal;
        this.interest = interest;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    void calculator(int noOfYears){
        BigDecimal totalValue=principal.add(principal.multiply(interest).multiply(new BigDecimal(noOfYears)));
        System.out.println("Interest rate is " + totalValue);
    }

}
