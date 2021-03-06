package com.company;

import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {

        // A string is basically anything inside of double-qoutes ("") text, numbers, everything on keyboard. Strings are complex objects.
        // Strings are immutable. This means they cannot be changed.
        //Strings in Java are case-sensitive, because 2 strings it sees upperCase alphabet and lower case alphabet differently
        System.out.println("I love coding"); // String literal

        // Two main ways how to create strings:
        String objectString = new String("I am going home"); //creating new object, with keyword NEW, this type takes more space,is unideal
        String regularString = "I am going to the beach"; // this way easier and more efficient
        // the index of the first character in a string is 0 (stringā zīmes sāk skaitīt no 0, pirmais burts ir 0)
        // the index of a last character in a string is less than the length of the string by 1

        System.out.println(regularString.toUpperCase(Locale.ROOT)); //pārtaisa uz caps lock
        System.out.println(regularString.length()); //saksiata simbolus, arī atstarpes
        
        int counter = 0; // šis nozīmē, ka sāk skaitīt no nulles
        for (int i = 0; i < regularString.length() ; i++) {
            System.out.println(regularString.toLowerCase().charAt(i));
            if ('a' == regularString.charAt(i)) {
                counter++;
            }
        }
        System.out.println("The number of times A appeared is:" + counter);


        //TASK1
        //Write a program to count the number of times a vowel appears in a word
        //Physician - pirmais vārds
        //Aerodynamics - otrais vārds

        String firstWord = "Physician";
        String secondWord = "Aerodynamics";
        int counterFirst = 0;
        int counterSecond = 0;
        for (int i = 0; i <firstWord.length() ; i++) {
            if ('a' == firstWord.charAt(i) || 'o' == firstWord.charAt(i) || 'e' == firstWord.charAt(i) || 'i' == firstWord.charAt(i) || 'u' == firstWord.charAt(i)) {
                counterFirst++;
            }
        }
        for (int i = 0; i <secondWord.length() ; i++) {
            if ('a' == secondWord.charAt(i) || 'o' == secondWord.charAt(i) || 'e' == secondWord.charAt(i) || 'i' == secondWord.charAt(i) || 'u' == secondWord.charAt(i)) {
                counterSecond++;
            }
        }

        System.out.println("The number of vowels in the first word is: " + counterFirst);
        System.out.println("The number of vowels in the first word is: " + counterSecond);


    }
}
