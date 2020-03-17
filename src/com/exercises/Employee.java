package com.exercises;
import java.math.BigDecimal;

public class Employee extends Person {

    private String title;
    private String employer;
    private int employeeGrade;
    private BigDecimal sallary;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public int getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(int employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public BigDecimal getSallary() {
        return sallary;
    }

    public void setSallary(BigDecimal sallary) {
        this.sallary = sallary;
    }


    @Override
    public String toString() {
        return String.format("title - %s, employer - %s, employeeGrade  - %d, sallary - %f, name - %s, phone - %d, " +
                "e-mail - %s", title, employer, employeeGrade, sallary, getName(), getPhone(), getEmail() );
    }





}
