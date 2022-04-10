package com.company;

import java.util.Arrays;

public class SortingAlgos1aprilis {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 8, 5, 3, 9};


//BUBBLE SORT -> sort numbers by comparing numbers adjacent to it, lēns, ja vajag sortot daudz data
      /*  for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    //create a temporary variable to hold the current value at index j
                    int temp = numbers[j];

                    //Swap the numbers with each other
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));*/


//INSERTION SORT - this algortihm sorts numbers by comparing the values at the indexes with the previous elements to sort the elements
        //we place the value at the index where there are no lesser values that the element
        //Arī tik pat lēns kā bubble sort

        /*for (int i = 1; i < numbers.length ; i++) {
            int valueToSort = numbers[i];
            int j;
            // the loop below is to store the numbers at the point where there are no less numbers than the value
            for (j = i; j > 0 && numbers[j - 1] > valueToSort; j--) {
                numbers[j] = numbers[j-1];
            }
            numbers[j] = valueToSort;
        }
        System.out.println(Arrays.toString(numbers));*/


//SELECTION SORT - FIND THE MINIMUM ELEMENT AND SWAP THAT ELEMENT WITH THE CURRENT ELEMENT. repeat the process until array is fully sorted
//
        /*for (int i = 0; i < numbers.length; i++) {
            int index = i; // current index of the number
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[index]){
                    index = j; //swap if number at position j less than the number at position index
                }
            }
            int smallerNumber = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = smallerNumber;
            
        }
        System.out.println(Arrays.toString(numbers));*/

    }
}





