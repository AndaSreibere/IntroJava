package com.company;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;



public class HomeAssignDateMarch21 {
    public static void main(String[] args) throws ParseException {

//TASK 1 - Write a Java program to get year and months between two dates.
        LocalDate today = LocalDate.now();
        LocalDate userDay = LocalDate.of(2020, 6, 23);
        Period difference = Period.between(userDay, today); //Period class allows to find duration between 2 dates
        System.out.println("The difference between " + userDay + " - " + today + ": " + difference.getYears() + " Years" + " and " + difference.getMonths() + " months");


//TASK 2 - Write a Java program to calculate the difference between two dates in days.
        LocalDate userDate1 = LocalDate.of(2022, 1, 3);
        LocalDate userDate2 = LocalDate.of(2022, 3, 22);

        long numberOfDaysBetween = Math.abs(ChronoUnit.DAYS.between(userDate1, userDate2)); //abs dod pozitivu, pat ja negativs. lieto tikai tad, kad zina, ka tas neietekmes rezultatu
        System.out.println("The difference between time in days is: " + numberOfDaysBetween);


//TASK 3 - Write a program to calculate the age of a person, considering that they only enters their date of birth NORAKSTIT IERAKSTAA
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date of your birth dd-mm-yyyy: ");
        String userBirthday = scanner.nextLine();

//TASK 4 = NORAKSTIT IERAKSTAA














//TASK 4 - Write a program to calculate the number of days between to specified years


    }
}
