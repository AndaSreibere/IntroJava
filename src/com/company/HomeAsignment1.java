package com.company;

public class HomeAsignment1 {
    public static void main(String[] args) {



        //Hometask1: Write a program that will output a prime number between 1-80 (use 2 for loops, 1 counts for numbers and other checks for prime nr)
        //Prime numbers (nospiež for i un enter)
        // a prime number is number that can only be devided by 1 and itself without reminders
        // use the FOR loop typically when you have an idea of how many times the loop is supposed to run
        for (int i = 2; i <=80 ; i++) { // Run from 1-80
            int counter = 0; // initialize counter to count the number of numbers that divide i - šis counter norādīts, lai sāk skaitīt no nulles, no sakuma
            // if you divede numb by 2, and those halves still cant devide by 2 without reminder, it is prime number
            // e.g. if you devide 10/2, you get 5.But if you devide 11/2 you get 5.5
            // 5.5 inside an int will give you 5, 11/5=2.2 tātad tas sanāk prime number. j sasniegs max40, jo i/2
            for (int j = 2; j <= i/2 ; j++) { // nested loop - a loop inside the other loop - šis reāli meklēs tos prime numbers. Dala ae 2 laikam tāpēc, ka tad ja prime number sadala ar 2 un paliek reminder, tad tas noteikti ir prime number
                if (i % j == 0){ // if this returns true, that is not a prime number
                    counter++; //increase the count of numbers that divede i.
                }
            }
            // use the counter to check how many numbers divided i. If counter is greater taht 0, that is no prime num.
            if (counter == 0){
                System.out.println(i + " is prime.");
            }
        }

        //Hometask2: Write a program that will act as a simple calculator where you set a variable as the operator and based on that
        //perform an arithmetic operation. For example if the operator variable is "+" then it will add 2 numbers and so on

        //SIMPLE CALCULATOR
        char operator = '+'; // te maini zīmi un tad arī mainās rezultāts attiecīgi kuram else if tas der
        int bigNumber = 15;
        float smallNumber = 3; // ja vismaz vienu inicializē kā float, tad rezultātu atgriezīs ar komatu. ja liktu tur decimālciparu, tad f klat (3.5f)

        if (operator == '+'){
            System.out.println("The sum is " + (bigNumber + smallNumber));
        } else if (operator == '-'){
            System.out.println("The difference is" + (bigNumber - smallNumber));
        } else if (operator == '*'){
            System.out.println("The product is" + (bigNumber * smallNumber));
        } else if (operator == '/'){
            System.out.println("The qoutient is " + (bigNumber/smallNumber));
        } else {
            System.out.println("Operator not recognized");
        }


        // continue - used to skip an iteration (one movement loop)
        // break - stop the loop immediately.
        // return - typically.
        // != not equal
        for (int i = 2; i < 20; i++) {
            if (i % 2 != 0) {
                continue; //ja te liek continue, tad izprintēs visus, kas dalās ar 2 bez atlikuma (skip tos, kas neder)
                //ja tur liek break, tas atro pirmo ciparu, kas izpildās un izbeidz
                //ja tur liek return, būs kkas līdzīgs break, izbeigs darbību, jo augšā metode ir void (psvm), kas ķipa neko neatgriež
            }
            System.out.println(i);
        }

    }
}
