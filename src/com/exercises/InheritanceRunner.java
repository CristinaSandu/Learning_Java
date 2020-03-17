package com.exercises;

import java.math.BigDecimal;

public class InheritanceRunner {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("GIgica");
        employee.setEmail("mail");
        employee.setPhone(444444);
        employee.setTitle("Manager");
        employee.setEmployer("S.A");
        employee.setEmployeeGrade(3);
        employee.setSallary(new BigDecimal(21));
        System.out.println(employee);
    }

}
