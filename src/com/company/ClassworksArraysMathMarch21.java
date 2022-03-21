package com.company;

import java.util.Scanner;

public class ClassworksArraysMathMarch21 {
    public static void main(String[] args) {

//TASK 1 - Ask the user to enter the sides of a right-angled triangle a, b, c. Find the area of the triangle
//TASK 2- Write a program to return the fibonacci sequence up to a specified length by the user
//for example: how many fibonacci number do you want to display?
// output: . .. .. ..

        //TASK 1 - mans risinajums
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Enter the side a (cathetus): ");
        int sideA = scanner.nextInt();
        System.out.println("Enter the side b (cathetus): ");
        int sideB = scanner.nextInt();
        System.out.println("Enter the side c (hypotenuse): ");
        int sideC = scanner.nextInt();

        System.out.println("Area of a triangle is: " + (sideA*sideB)/2 );*/



        //TASK 2 - mans risinajums
        System.out.println("How many fibonacci numbers do you want to display: ");
        int fibonacciCount = scanner.nextInt();

        int number1 = 0, number2 = 1, number3, i;
        System.out.print(number1 + " " + number2);//printing 0 and 1

        for (i = 2; i < fibonacciCount; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            number3 = number1 + number2;
            System.out.print(" " + number3);
            number1 = number2;
            number2 = number3;


        }
    }
}
