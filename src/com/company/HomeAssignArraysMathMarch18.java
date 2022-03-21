package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class HomeAssignArraysMathMarch18 {
    public static void main(String[] args) {

//TASK 1 - es laikam nepaspeju te
        //Write a Java program to find maximum product of two integers in a given array of integers Example:
        //Input :
        //nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
        //Output:
        //Pair is (7, 8, Maximum Product: 56

       /* int[] numbers = {2, 3, 4, 7, -7, 5, 8, -5};
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("The product of the highest two multiplying number is: " + (numbers[numbers.length -1 ]) * numbers[numbers.length -1]);*/

//TASK 2 //Write a Java program to find minimum subarray sum of specified size in a given array of integers Example:
//        //Input :
//        //nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10}
//        //Output:
//        //Sub-array size: 4
//        //Sub-array from 0 to 3 and sum is: 10
        Scanner scanner = new Scanner(System.in);
        //Prompt user to enter a list of numbers
        System.out.println("How many numbers do you want to enter? :");
        int[] numbers = new int [scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        // sort the array:
        Arrays.sort(numbers);

        //prompt the user to enter the minimum size of the array to add
        System.out.println("Enter the minimum size to add: ");
        int minSize = scanner.nextInt();

        int sumMinSize = 0;

        // sum the minimum of the array
        for (int i = 0; i < minSize; i++) {
            sumMinSize += numbers[i];
        }
        System.out.println("The min size is " + sumMinSize);

    }
}
