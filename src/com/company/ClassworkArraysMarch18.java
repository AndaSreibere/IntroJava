package com.company;

import java.util.Arrays;

public class ClassworkArraysMarch18 {
    public static void main(String[] args) {

//TASK 1 - write a program to rearrange the following array of uique elements such that each second integer is greater than the integers
        //to its left and right
        //use this Array {3, 5, 9, 10, 7, 2, 1}
        // result should look like this {1, 3, 2, 7, 5, 10, 9}

        int[] numbers = {3, 5, 9, 10, 7, 2, 1};
        //Loop trough the numbers array starting from the second element. Why second??
        for (int i = 1; i < numbers.length; i += 2) {
            //check the number preciding every second element
            if (numbers[i - 1] > numbers[i]) {
                int temp = numbers[i - 1]; // set it to the preceding (iepriekšējais) number
                numbers[i - 1] = numbers[i]; // set the preceding value to the current value
                numbers[i] = temp; //revive (atjauno) the temp value
            }

            //check for the right side as well
            if (i + 1 < numbers.length && numbers[i + 1] > numbers[i]) { // numbers[i] means current number
                int temp = numbers[i + 1]; // set it to the preceding (iepriekšējais) number
                numbers[i + 1] = numbers[i]; // set the preceding value to the current value
                numbers[i] = temp; //revive (atjauno) the temp value

            }
        }
        //output
        System.out.println("The arranged array is: " + Arrays.toString(numbers));
    }
}
