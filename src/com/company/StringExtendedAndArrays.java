package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringExtendedAndArrays {
    public static void main(String[] args) {
        //Scanner
        //Initializing the scanner class
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to perform an action
       // System.out.print("Enter your name: ");

      //  String userName = scanner.next(); //Accept the user input and save it to a variable
       // String userSurname = scanner.next();
       // System.out.println(userName + " " + userSurname); // return the output
       // scanner.close();

        //Task2 - Write a program to add as many 'r' to 'burp' by using a variable to regulate. For example, if that variable is set to 4, then it will output burrrrp
        //Prompt the user to enter the number of r to add
        System.out.print("Enter the number of rrr");
        int rNumber = scanner.nextInt();
        String rString = "";
        for (int i = 0; i < rNumber ; i++) {
            rString += "r";
        }
        System.out.println("bu" + rString + "p");




        // escape characters: are special characters that allow us to perform special actions from within a string
        //piemeram doble quotes inside double quotes, jāieliek backward slash \
        // vai \n creates a new line
        // vai \t creates a new tab
        // vai \r carriage turn, does the same as pressing enter (ķipa neuzrāda iepriekšējo rindu)

        System.out.println("The litthe \"Brown\" dog ");
        System.out.println("This is one line\nThis is a second line\tThis is another line\rThis is also another line");


        //Wrapper classes (converting primitive strings to primitive values)- ķipa tekstā ciparu pārtaisa par int vai double, lai tālāk var veikt matemātiskas operācijas
        String five = "5";
        int number = Integer.parseInt(five);
        System.out.println((number + number) * number);

        String six = "6.00001";
        double sixValue = Double.parseDouble(six);

        String falseString = "false";
        boolean falseValue = Boolean.parseBoolean(falseString);
        System.out.println(falseValue);

        //Regex - particular field is checking for particular parameters(piem.vadot website epastu epasta laukā, jau laicīgi pasaka, ka kaut kas nav pareiz)
        // Quantifiers are a construct under REGEX that allows us to take note of the occurances of a particular sequence in a string
        //aaabbbeee
        // + checks if a caharacter or sequence has at lest one occurance in the string .e.g. a+bc -> checks if there is at least one a in the string being tested
        // * checks if a character appears zero or more times
        // ? checks if a charactes appears zero or one time
        // Documentation: https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html and https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html

        Pattern pattern = Pattern.compile("a+d"); // Pattern checker
        Pattern pattern2 = Pattern.compile("[a-zA-Z0-9]+"); // Pattern checker, šo neizlaiž, laikam tāpēc, ka čeko pirmo tikai, kad aizkomeneju, izlaida
        Matcher matcher = pattern.matcher("adidas099"); // String to check
        System.out.println(matcher.matches()); // This returns true if they match and false if not

        // šito nokopēju no viņa:       Pattern pattern = Pattern.compile("a+[bc]+"); // Pattern checker
//
//        Matcher matcher = pattern.matcher("aaaaacd"); // String to check
//        Matcher matcher2 = pattern.matcher("boogieboy109"); // String to check
//        System.out.println(matcher.matches()); // This returns true if they match and false if not.
//        System.out.println(matcher2.matches()); // This returns true if they match and false if not.


        // Tasks:
        // Task 1: 15 mins
        // Write a program that accepts a string from the user and returns
        // the number of vowels that can be found in that string.
        // For example: If the user enters the string, "Bodacious" -> 5
        // Caveat: Make your program interactive.

        // Task 2: 15 mins
        // Write a program that accepts 5 numbers from a user AS STRINGS.
        // DO NOT USE THE nextInt() method.
        // Add the first two numbers and subtract the second two numbers and
        // multiply the result of the calculation above, then
        // divide the result by the last number and print interactively.
        // 5, 4, 3, 2, 1 -> 5 + 4
        // 3 - 2
        //

        // Prompt the user for a string
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
