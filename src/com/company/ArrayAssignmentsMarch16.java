package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignmentsMarch16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //TASK 1 - You're given a string of words from the user. You need to find the word "Nemo",
        // and return a string like this: "I found Nemo at [the order of the word you find Nemo]!". If you can't find Nemo,
        // return "I can't find Nemo :(".

        //TASK 2 - Create a program that takes an array and returns the difference between the biggest and smallest numbers.

        //TASK 3 - Create a program that takes an array of Strings (You can intialize the variable without user input)
        // and checks if the last item matches the rest of the array concatenated together.
        // For example,  ["i", "love", "tesh", "ilovetesh"] will return true

        // TASK 1 SOLUTION
        //Receive inppuy from user
        /*System.out.println("Please enter a string");
        String userInput = scanner.nextLine();

        //Break the string into words
        String[] wordArray = userInput.split(" ");

        //Loop trough and FIND the position of the word nemo
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].equalsIgnoreCase("Nemo")){
                System.out.println("I found Nemo at word number: " + (i + 1) + "!");
                break;
            }
            if (i == wordArray.length - 1 && !wordArray[i].equalsIgnoreCase("Nemo")) {
                System.out.println("I cant find nemo");
            }

        }*/






//TASK 2 - Create a program that takes an array and returns the difference between the biggest and smallest numbers.
        //Receive the input from the user
        /*System.out.println("How many number do you want to enter?: ");
        int[] numbers = new int[scanner.nextInt()];

        // Populate the array with data
        for (int i = 0; i < numbers.length; i++) {
            //Prompt the user to enter a number
            System.out.println("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        // te iekavās izvēlas first element from the array, kas ir nulle, to ensure that min and max correlates with our existing dataset
        int minimum = numbers[0];
        int maximum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (maximum < numbers[i]) maximum = numbers[i]; //if maximum less than number, then it becomes new maximum. nesapratu.
            if (minimum > numbers[i]) minimum = numbers[i]; //te tas pats, arī nesapratu.
        }
        System.out.println( Arrays.toString(numbers) + "max number: " + maximum);
        System.out.println( Arrays.toString(numbers) + "min number: " + minimum);
        System.out.println(Arrays.toString(numbers) + "Difference between min and max number: " + (maximum - minimum));*/





//TASK 3 - Create a program that takes an array of Strings (You can intialize the variable without user input)
        // and checks if the last item matches the rest of the array concatenated together.
        // For example,  ["i", "love", "tesh", "ilovetesh"] will return true

        String[] stringArr =  {"i", "love", "tech", "ilovetech"}; //to var pierakstīt arī kā:  String[] stringArr = new String [cipari]
        String appender = "";
        for (int i = 0; i < stringArr.length - 1; i++) {
            appender += stringArr[i];
        }
        //Ternary operator - another version of if else conditional
        //Ternary operator is a conditional that can be used to decide execution flow on the fly un var pierakstīt vienā rindā, nevis kā else if
                                //condition                                     //true          //false
        System.out.println(appender.equals(stringArr[stringArr.length - 1]) ? "match" : "dont match");
        //example:
        System.out.println(5 < 8 ? "less" : "greater");

    }
}
