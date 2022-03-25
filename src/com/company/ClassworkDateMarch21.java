package com.company;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class ClassworkDateMarch21 {
    public static void main(String[] args) {
        //java.util
        //it contains tools for managing and manipulating dates
        /*Date date = new Date();
        System.out.println(date);

        //deprecated means that something is no longer in use
        System.out.println(date.getTime()); // te iegūst kaut kādu milisekundes laiku

        LocalTime timeLocal = LocalTime.now();
        System.out.println(timeLocal);

        LocalDate timeDate = LocalDate.now();
        System.out.println(timeDate);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);*/

        // TASK 1 - a leap year is a year with an additional day in it, because of Feb
        //Write a program that accepts a year from user and tells the user if the year is a leap year or not

        //TASK 2 - Write a program that returns the number or amount of hours between two o'clock times entered by the user

        //TASK 1 - mans risinājums
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        int userYear = scanner.nextInt();

        if (userYear % 4 == 0) {
            System.out.println(userYear + " is a leap year");
        } else
            System.out.println(userYear + " is not a leap year");



        //TASK 2 - mans risinājums - nesanaca
      //  System.out.println("Please enter the number of hours: ");
        //int userHours = scanner.nextInt();
       // int timeTwoOclock = LocalTime;
       // System.out.println(userHours + timeTwoOclock);


        //TASK 1- UCHE risinājums -
        System.out.println("Enter another year: ");
        int newYear = scanner.nextInt();
        boolean isLeap = newYear % 400 ==0 || newYear % 4 == 0 && newYear % 100 != 0;
        System.out.println(isLeap ? "leap year" : "Not leap year");


        //TASK 2
        System.out.print("Enter the start hour: ");
        String userStart = scanner.nextLine(); // 5:00 AM

        System.out.print("Enter the end hour: ");
        String userEnd = scanner.nextLine(); // 8:00 AM

        // Get the value of the hours
        int startHour = Integer.parseInt(userStart.split(":")[0]);
        int endHour = Integer.parseInt(userEnd.split(":")[0]);

        // If a time entered is in the morning assign it 12 else assign it 24
        // to make it easy to compare numerically.
        int amPmOne = userStart.split(" ")[1].equals("AM") ? 12 : 24; //8:00 => ["8:00", "AM"]
        int amPmTwo = userEnd.split(" ")[1].equals("AM") ? 12 : 24;

        // subtract and find out the difference
        int difference =(endHour+amPmTwo) - (startHour+amPmOne);
        if (amPmOne < amPmTwo && startHour > endHour) difference +=12;


        System.out.println(difference == 0 ? "No time has passed." : difference + " hours");




    }
}

