package com.company;
import java.util.Locale;
import java.util.Scanner;

public class StringClassworkMarch9 {
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
        //switch nozīme - kaut ko crosschecking SWITCH CHECKS ONLY VAI IR VIENADS --- EQUALITY
        // case - condition you are checking for
        // Pie switch j'alieto break
        int counter = 0;  //initialize a counter variable to count the vowel occurrences.
        for (int i = 0; i < inputString.length(); i++) { //for uzliek LOOP
            char currentLetter = inputString.toLowerCase().charAt(i); // The current letter we are checking.
            switch (currentLetter) {
                case 'a': // visus 'sos case var likt vienu zem otra (collapsing) neatk'artojot pec katra counter++ un break, ja visiem j'adara viena ta pati darbiba
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;


            }
        }
        System.out.println("The number of vowels in the string is: " + counter);




        // Task 2: 15 mins
        // Write a program that accepts 5 numbers from a user AS STRINGS.
        // DO NOT USE THE nextInt() method.
        // Add the first two numbers and subtract the second two numbers and
        // multiply the result of the calculation above, then
        // divide the result by the last number and print interactively.
        // 5, 4, 3, 2, 1 -> 5 + 4
        // 3 - 2

        Scanner scannerTask2 = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        String first = scannerTask2.nextLine();

        System.out.println("Enter the second nmber: ");
        String second = scannerTask2.nextLine();

        System.out.println("Enter the third number");
        String third = scannerTask2.nextLine();

        System.out.println("Enter the fourth number");
        String fourth = scannerTask2.nextLine();

        System.out.println("Enter the fifth number");
        String fifth = scannerTask2.nextLine();

        System.out.println("Your result is: " + (Float.valueOf(first) + Float.valueOf(second))*(Float.valueOf(third) - Float.valueOf(fourth)) / Float.valueOf(fifth));





    }
}
