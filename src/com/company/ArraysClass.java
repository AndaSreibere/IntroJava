package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // An array is a collection of multiple data units of a single data type (set of items one type in one box)
        // Indexing for an array starts at 0

        //First way to declare an array (when you have predetermined values)
        /*int[] numbers = {4, 5, 0, 4};
       // šādi pa taisno var darīt, kad lieto array
        System.out.println(numbers.length);

        // Second way to declare an array (you have unknown values to be added later)
        int[] number = new int[4]; // 4 ir item skaits arrayaa. default value for int is 0 - prasīs ievadīt 4 ciparus
        String[] textArr = new String[6]; // default value for object (also String) is null

        textArr[3] = "orange"; // 3 ir index, sāk skaitīt 0,1,2,3 un 3 ir orange

        for (int i = 0; i < textArr.length ; i++) {
            System.out.println(textArr[i]);

        }

        //Receive the input to populate the array
        for (int i = 0; i < numbers.length; i++) { // promt the user to enter a number
            System.out.println(number[i]);
            System.out.println("Enter a number: ");
            number[i] = scanner.nextInt();
        }
        //Find the sum of the numbers
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];

        }
        System.out.println(Arrays.toString(number));
        System.out.println("The sum of the variables is: " + sum );*/


        // Task 1: Write a program to find the avarage of a set of numbers that the user enters
        // Allow the user to decide the number of integers to enter
        // Interactively return the output to the console (25mins)

//mans risinājums
        /*System.out.println("Please enter 5 numbers: ");
        int[] userNumber = new int[5];
        for (int i = 0; i < userNumber.length; i++) { // promt the user to enter a number
            userNumber[i] = scanner.nextInt();
        }
        //Find the sum of the numbers
        int newSum = 0;
        for (int i = 0; i < userNumber.length; i++) {
            newSum += userNumber[i];
        }
        //calculate average
        float averageSum = newSum;
        float result = (newSum / 5);
        System.out.println("Average : "+ result);*/

// teacher risinājums
        //Prompt the user to enter how many numbers
        System.out.println("How many numbers do you want to average? : ");
        int numberOfNumbers = scanner.nextInt();
        // create the array using the number of numbers as the length
        int[]numberrs = new int[numberOfNumbers];
        // populate the array
        for (int i = 0; i < numberrs.length ; i++) {
            // prompt the user to enter a number
            System.out.println("Enter a number: ");
            numberrs[i] = scanner.nextInt();

        }
        //the value of a set of numbers is the sum of the numbers / the number of numbers
        // Find the sum of the numbers
        float sum = 0;
        for (int i = 0; i < numberrs.length; i++) {
            sum += numberrs[i];
        }
        System.out.println("The average of the numbers" + Arrays.toString(numberrs) + "is: " + (sum)/numberrs.length);








    }

}
