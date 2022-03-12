package com.company;

public class StringAsignment {
    public static void main(String[] args) {

      // Task1 - Write a program to compare 2 strings by their length and return output that tells the user if the strings are equal or not
      //Task2 - Write a program to add as many 'r' to 'burp' by using a variable to regulate. For example, if that variable is set to 4, then it will output burrrrp
        // Task3 - Write a program to remove the first and last letter of a string
        // Task 4 = Write a program to reverse a string and capitalize all the letter (hello becomes OLLEH)

        //TASK1 Write a program to compare 2 strings by their length and return output that tells the user if the strings are equal or not
        String stringOne = "I love programming";
        String stringTwo = "Coding is fun";
        if (stringOne.equals(stringTwo)){
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }

        //TASK2 Write a program to add as many 'r' to 'burp' by using a variable to regulate. For example, if that variable is set to 4, then it will output burrrrp
        String rString = ""; // this is going to contain rrrr
        int rNumber = 4;
        for (int i = 0; i < rNumber ; i++) {
           // rString = rString + "r"; // pievienos r pie rString
            rString += "r";
        }
        System.out.println("bu" +rString + "p");


        // TASK3 - Write a program to remove the first and last letter of a string
        String word = "hello";
        System.out.println(word.substring(1, 4)); // tie cipari norada indexu, kas ir burta kārtas skaitlis, kas vienmēr sākas ar 0
        //substring just return a portion of the string what you need

        //TASK4 -  Write a program to reverse a string and capitalize all the letter (hello becomes OLLEH)
        String wordString = "cocomelon";
        String reversedString = "";
        for (int i = wordString.length() - 1; i > -1; i--) {
            System.out.println(i);
            reversedString += wordString.charAt(i); //append the characters in reverse to the empty string, respektīvi, skaita atpakaļ no 8 un printe apgriezta secibaa
        }
        System.out.println(reversedString.toUpperCase());



    }
}
