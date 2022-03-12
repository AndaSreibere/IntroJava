package com.company;

public class Loops {
    public static void main(StringTest[] args) {

        //Loops are a construct that allows us to repeat a set of commands until a condition to terminate is reached
        // Do-while loop is saying to do this until condition is true (do-while ir mazak lietotais)

        int count = 0;
       do {
           System.out.println(count); // print out the count
           count = count + 1; // increase count by 1
        } while (count < 10);

        // while loop is saying do this (vispirms checko condition un tad dara)
        // PRO tip - use while loops when you don't have an idea of how many times the loop is supposed to run
        // i++ ir tas pats, kas count = count + 1
        //šis dara to pašu, ko iepriekšējais, tikai vispirms checks condition un tad printē

        while (count < 11) {
            System.out.println(count);
            count = count + 1;
        }

        // for loop - šo lieto, kad zina, cik reizes it is supposed to run
        // use the for loop typically when you have an idea of how many times the loop is supposed to run
        // i - initilization
        //count = count +1 ir tas pats, kas i++
        for (int i = 8; i < 15; i++) {
            if (i > 9) {
                System.out.println(i + " is greater than 9");
            }
        }

        // task1: write a program using a loop that print out "even" when an even number is encountered between 1- 50
        // and "odd" when an odd number is encountered
        for (int i = 1; i<= 50; i++) {
            if (i % 2 == 0){
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }



        //task2: write a program using while loop that will print out all the multiples of 4 between 1 and 50 (a multiple of 4 is a number that can be
        // divided by 4 without any reminders

        //Unary operators: (pievieno pa vienai vērtībai nu vai atņem pa vienai vērtībai)
        // Addition
        // pre-incrementation operators: ++counter, when it is used, value is incrementet before it is read. is is the same as (==) counter = counter+1
        // post-incrementation operators: counter++ , when it is used, value is read before it is incremented

        //Substarction
        //pre-decrementation operator: --counter
        //post- decrementation operator: counter--

        //te piemers tiem counteriem ++
        int value = 9;
        System.out.println(value+1);
        value++;
        System.out.println(value); // un ja iepr.rinda nepieliktu value++, tad pie sout varetu likt ++value un izprintetu to pasu 10


//šis ir task2
        int counter = 1; //initializing counter
        while (counter <=50) { //kamēr counter ir mazāksvai vien ar 50
            if (counter % 4 == 0){ //ja counter dala ar 4 bez atlikuma (modulus)
                System.out.println(counter); // tikai tad izprintē to konkrēto ciparu
            }
            counter++; // tas pats, kas i++
        }

        //task3 20 mins - Write a program that print numbers 1-50. And if a number is dividable by 3 then replace that number with word "Fizz"
        // if a number is dividable by 7, then replace number with the word "Buzz"
        // if the number is dividable by both 3 and 7 then replace that number with the word "Fizzbuzz"
        // es te izdar'iju nepareizi - vajadz'eja izmantot FOR (nospied fori un enter)
        // šādos gadijumos vispirms jaliek tie,kur jaceko vairāki conditions, tāpēc fizzbuzz pirmais

        for (int i = 0; i <=50 ; i++) {
            if (i%3 ==0 && i%7 ==0){
                System.out.println("FizzBuzz");
            } else if (i%7 ==0){
                System.out.println("Buzz");
            } else if (i%3 ==0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }







    }
}
