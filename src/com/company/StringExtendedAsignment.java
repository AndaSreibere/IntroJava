package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StringExtendedAsignment {
    public static void main(String[] args) {
        //TASK1 - Write a program that returns true interactively,
        // if a user enters a string containing any of these characters: 'u', 'w', '6', 'i', 'b', 'q'

        // TASK2 - Write a program that accepts a String from a user and prints an interactive response telling the user
        // if the word is the same when spelt backwards. For example, bread when spelt backwards is daerb, which isn't quite the same.

        // TASK 3 - Write a program that accepts any of the primary colors as a
        // String and returns the complimentary color of that color to the user.

        Scanner scanner = new Scanner(System.in);

        //Task1
        //Take input from the user
        /*System.out.println("Enter a string: ");
        String userInpput = scanner.nextLine();
        String responseString = ""; // šīs uzlika kā tukšas
        String errorString = "";

        for (int i = 0; i < userInpput.length(); i++) {
            //Pick out the particular character to be checked:
            char checkLetter = userInpput.toLowerCase().charAt(i);

            switch (checkLetter){
                case 'u':
                case 'w':
                case '6':
                case 'i':
                case 'b':
                case 'q':
                    responseString = "The character " +checkLetter + " is contained in the string" + userInpput;
                    break;
                default:
                    errorString = "No accepted characters were found";
                    break;
            }
        }

        if (responseString.isEmpty()){ //this is outside the loop
            System.out.println(errorString);
        } else {
            System.out.println(responseString);
        }
*/
//TASK 2 solution
        //Prompt user to enter a string
       /* System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();
        String reverseInput = "";*/

        //Append the string in reverse to the reverseString variable
        /*for (int i = userInput.length() -1; i > -1 ; i--) {
            System.out.println(userInput.charAt(i));
            reverseInput += userInput.charAt(i); // reverseInput = reverseInput +userInput.charAt(i);
        }

        //decide the output based on the equality of the strings
        if (reverseInput.equalsIgnoreCase(userInput)) { //ignore case čeko stringus, neskatoties uz burtu lielumu
            System.out.println("The string" + userInput + "is the same as" + reverseInput + ", therefore a palindrome");
        } else {
            System.out.println("String" + userInput + "is not the same as " + reverseInput + ", therefore, not a palindrome");
        }*/

        // concardination is joining 2 strings together
        // TASK 3 solution
        // Red + yellow = orange
        // ywllow + blue = green
        // red + blue = purple
        // complementary color :
        // red = green
        //blue = orange
        // yellow = purple

        // prompt the user to enter a color
        System.out.println("Enter a primary color: ");
        String userColor = scanner.nextLine();

        switch (userColor.toLowerCase()){
            case "red":
                System.out.println("The complimentary color of red is Green");
                break;
            case "blue":
                System.out.println("The complimentary color of blue is Orange");
                break;
            case "yellow":
                System.out.println("The complimentary color of yellow is purple");
                break;
            default:
                System.out.println("You did not enter a primary color");
                break;
        }



    }
    }

