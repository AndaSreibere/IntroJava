package com.company;

import org.w3c.dom.ls.LSOutput;

public class MethodsRecursion30marts {
    public static void main(String[] args) {
        System.out.println(factorial(5)); // piemers par factorial
        System.out.println(lenghtOfString("hello")); //piemers par string
    }

    // Recursion is a phenomenon where a method calls itself.
    // a base case is the condition under which  you want a recursive operation to end.

    //Factorial of a number is the multiplication of that number by all the positive integers between 1 and the number
    //The only exception being ir nulles factorial (0!), tas ir 1.
    // An example 5! (factorial of 5) 5! -> 5*4*3*2*1 -> 120


//Te piemērs kā to dara parasti (using iteration (loops):
    public static int factorial (int number){
    int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i; // multiply all the number between 1 and given number
        }
        return result;
    }

//Te piemērs kā to dara ar recursion:
    public static int factorial2 (int number2){
        if (number2 == 0 || number2 == 1){ //
            return 1;
        }
        return number2 * factorial2(number2 -1); //pats samazina katru reizi par 1 until reach the target, kas ir 1,
        // ko norada iepriekš, ka return ir 1

        // 5*factorial(5-1) šādi tas notiek
        // 4*factorial(4-1)
        // 3*factorial(3-1)
        // 2*factorial(2-1)
        // 1

    }

//Write a method that returns the lenght of a string
    public static int lenghtOfString(String value){
        if (value.equals("")){
            return 0;
        }
        return lenghtOfString(value.substring(1)) +1;
    }


}
