package com.company;

public class Condtionals {
    public static void main(String[] args) {




        int age;
        age = 30;

        char gender;
        gender = 'F';

        double height;
        height = 1.74;

        int weight;
        weight = 75;

        //---

        boolean bool = true;
        boolean loob = false;


        //1
        System.out.println(6<9 && 9>2);
        //2
        System.out.println(5>9 || 8<3);
        //3
        System.out.println(8==2 && 7<6);


        //using an IF statement print out numbers between 8 and 14 that are greater than 9
        int number = 8;
        if (number>9 && number <15) {
            System.out.println(number + " is greater then 9");
        } else {
            System.out.println(number + " is not greater then 9");
        }

        //tas pats uzdevums

        int value =16;
        if (value ==11){
            System.out.println(value + " is eleven");
        } else if (value >9 && value < 15) {
            System.out.println(value+ " is greater than 9");
        } else if (value < 9){
            System.out.println(value + " is not greater than 9");
        } else {
            System.out.println(value + " is greater than the range");
        }




    }
}
