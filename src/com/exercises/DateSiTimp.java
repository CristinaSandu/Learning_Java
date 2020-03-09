package com.exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateSiTimp {

    public static void main(String[] args) {
        LocalDate dataLocala=LocalDate.now();
        System.out.println("Data locala " + dataLocala);

        LocalDateTime nownow=LocalDateTime.now();
        System.out.println("Data si ora locala " + nownow);

        LocalTime ora = LocalTime.now();
        System.out.println("Ora locala " + ora);

        //Se poate importa tot pachetul scriind doar import java.time.*

        System.out.println("Era " +  dataLocala.getEra());
        System.out.println("Ziua din An " +  dataLocala.getDayOfYear());
        System.out.println("E an bisect " +  dataLocala.isLeapYear());
        System.out.println("Data peste 10 zile " +  dataLocala.plusDays(10));
        System.out.println("Data acu 10 ani " +  dataLocala.minusYears(10));

        LocalDate todateMinusNineDays=dataLocala.minusDays(9);
        System.out.println("Data acu 9 zile " + todateMinusNineDays);
    }
}
