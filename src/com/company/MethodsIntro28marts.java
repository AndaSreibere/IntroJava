package com.company;
import java.util.Scanner;
public class MethodsIntro28marts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Priekš TASK1
        System.out.println("Enter a string: ");
        String userString = scanner.nextLine();
        System.out.println("The total number of consonants in the string is: " + countConsonants(userString));

        //Priekš TASK2
//prompt user for input
        System.out.println("How many numbers do you want to enter? : ");
        int[] userNumbers = new int[scanner.nextInt()];
// to populate an array
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("Enter a number: ");
            userNumbers[i] = scanner.nextInt();
        }

        System.out.println("The maximum value in the array is: " + findMax(userNumbers));

    }

    //TASK 1 - write a method that takes in a string and returns the number of consonants in the string. Input from user
    //TĀTAD VISU SKANERUS UN SOUT PALAIŽ NO MAIN METODES
    // UN TAS KĀ NOSAUC METODI IR BEIGĀS TAS PATS RETURN, tāpēc pie pēdējā sout ir:
    // system.out.println("The total number of consonants in the string is: " + countConsonants(userString)); tas countConsonants ir metodes nosaukums!!!!
    //mazā metode ir kādam konkrētam uzdevumam, tā nedara neko citu, tāpēc projektu dala mazās metodēs, lai tas ir labāk pārskatāms

    public static int countConsonants(String word) {
        int vowelCount = 0;
        char[] wordArr = word.toLowerCase().toCharArray();

        for (int i = 0; i < wordArr.length; i++) {
            char currentChar = wordArr[i];
            switch (currentChar) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
            }
        }
        return word.length() - (vowelCount); //number of consonant
    }









    // TASK 2 Write a method that takes in array of numbers and returns the maximum number in the array. dont use math.max() method
    // it should return an int

    public static int findMax(int[] numbers){
        //start by initializins the maximum variable
        int maximum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (maximum < numbers[i]){
                maximum = numbers[i];
            }
        }
        return maximum;
    }













}
