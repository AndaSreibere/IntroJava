package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class HomeAsignmentMarch14 {
    public static void main(String[] args) {
        //1. write a program that receives some numbers based on the users choice and then returns the largest number of entered

        //Initialize scanner
        Scanner scanner = new Scanner(System.in);

        //Prompt the user for input
        /*System.out.println("How many numbers do you want to enter");
        int[] numbers = new int[scanner.nextInt()]; // use the input to create an array to hold the values

        //populate the array with data
        for (int i = 0; i < numbers.length; i++) {
            //Prompt the user to enter a number:
            System.out.println("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        //Find the maximum number:
        int maximum = numbers[0];

        //compare the value with other elements in the array
        for (int i = 1; i < numbers.length; i++) {
            //If the current number is smaller then the maximum,then set is as the nev maximum
            if (maximum < numbers[i]){
                maximum = numbers[i];
            }
        }
        System.out.println("The largest number you entered is: " + maximum);*/


        //2.task Write a program that accepts a String from the user and returns an array of integers representing the counts of
        // each vowel in the String. The array returned by your method should hold 5 elements:
        // the first is the count of As, the second is the count of Es, the third Is, the fourth Os, and the fifth Us.

        // prompt the user enter a string
        System.out.println("Enter a string: ");
        String text = scanner.nextLine();
        //we know that array is going to have a lenght of 5
        int[] vowelCount = new int [5]; // si array holds 5 items
        //loop trough the string and count the vowels
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.toLowerCase().charAt(i);

            switch (currentLetter){
                case 'a':
                    vowelCount[0]++;
                    break;
                case 'e':
                    vowelCount[1]++;
                case 'i':
                    vowelCount[2]++;
                    break;
                case 'o':
                    vowelCount[3]++;
                case 'u':
                    vowelCount[4]++;
                    break;
            }
        }
        System.out.println("The vowel breakdown for " + text + "is" + Arrays.toString(vowelCount));





    }
}
