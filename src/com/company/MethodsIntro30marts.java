package com.company;
import java.util.Scanner;
import java.sql.SQLOutput;

public class MethodsIntro30marts {
    public static void main(String[] args) {
        //TASK 1:
        Scanner scanner = new Scanner(System.in);
        System.out.println(miniCalc(5, 8, "/"));
       // System.out.println("enter small number"); šādi liktu, ja gribētu, lai ciparus ievada lietotājs
       // double smallNum = scanner.nextDouble(); un te pie metodes saliktu tos atbilstošos nosaukumus public static double miniCalc(double smallNumber, double bigNumber, String operator)


        //TASK 2:
        System.out.println("Enter your password: ");
        String password = scanner.next();
        System.out.println(compare(password) ? "Password is correct" : "Password is incorrect");


        //TASK 3:
        System.out.println("Enter the principal: ");
        float principal = scanner.nextFloat();

        System.out.println("Enter the rate: ");
        float rate = scanner.nextFloat();

        System.out.println("Enter the time in years: ");
        int time = scanner.nextInt();

        System.out.println(simpleInterest(principal, rate, time));



        //TASK 4:
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(primeChecker(number));



    }

    // TASK 1 - write a method that accepts three parameters, double smallNumber, double bigNumber, String operator
    // based on the arithmetic operator passed, perform one of the following operations +, -, /,*
    // on the small and big number and return the result. The return should be double

   public static double miniCalc(double smallNumber, double bigNumber, String operator){
       double result = 0;
       switch (operator) {//based on what operator (+,-,/,*) is, I want to perform a certain actions
           case "+": //in case there is plus, return summu abiem cipariem
               return smallNumber + bigNumber;
           case "-":
               return bigNumber - smallNumber;
           case "*":
               return bigNumber * smallNumber;
           case "/":
               return bigNumber / smallNumber;
           default:
               System.out.println(operator + " operator is not a valid option");
               return 0;

       }

   }



  //TASK 2 - Write a method that compares two strings (that could be passwords) and returns true of false based on their equity
public static boolean compare (String enteredPassword) {
    // Assume entered password is helloworld
    String password = "helloworld";
    return enteredPassword.equals(password);
}



  // TASK 3 - Write a method to calculate simple interest and return in, google simple interest formula
public static float simpleInterest (float principal, float rate, int time){
        return (principal * rate * time) / 100;
}



//TASK 4 - Write a method that accepts an integer and returns whether that integer is a prime number or not
public static String primeChecker (int number) {
        int temp;
        boolean isPrime = true;

    for (int i = 2; i <=number/2 ; i++) {
        temp = number % i;
        if (temp == 0){
            isPrime = false;
            break;
        }
    }
    if (isPrime){
        return " is a prime number";
    } else {
        return "is not a prime number";

        }
    }
}
