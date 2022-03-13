package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        // Tasks:
        // Task 1: 15 mins
        // Write a program that accepts a string from the user and returns
        // the number of vowels that can be found in that string.
        // For example: If the user enters the string, "Bodacious" -> 5
        // Caveat: Make your program interactive.

        // TASK1 - Prompt the user for a string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String inputString = scanner.nextLine();

        //initialize a counter variable to count the vowel occurrences.
        int counter = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char currentLetter = inputString.toLowerCase().charAt(i); // The current letter we are checking.
            switch (currentLetter) {
                case 'a':
                case 'e':
                    counter--;
                    break;
                case 'i':
                case 'o':

                case 'u':
                    counter++;
                    break;
//                default:
//                    System.out.println("Not a vowel");
//                    break;
            }
        }

        System.out.println("The number of vowels in the string is: " + counter);





    }
}
