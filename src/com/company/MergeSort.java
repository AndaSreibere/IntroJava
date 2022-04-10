package com.company;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 8, 5, 3, 9};
        mergeSort(0, numbers.length - 1, numbers);
        System.out.println(Arrays.toString(numbers));
    }

    //MERGE SORT - DIVIDE ARRAY IN SUBARRAYS OF ABOUT HALF SIZE IN EACH ITERATION/REPETITION UNTIL EACH SUB ARRAY HAS ONLY ONE ELEMENT
//MERGE each subarray repeatedly to create sorted arrays. This is going to repeat itself until we have one sorted array
    public static void mergeSort(int start, int end, int[] numbers) {
        //Recursive method:
        int mid = (start + end) / 2;

        if (start < end) {
            //sort the left half
            mergeSort(start, mid, numbers);

            //sort the right half
            mergeSort(mid + 1, end, numbers);

            //merge
            merge(start, mid, end, numbers);

        }
    }

    public static void merge(int start, int mid, int end, int[] numbers) {
        //Initializing a temporary array and index
        int[] tempArray = new int[numbers.length];

        int tempArrayIndex = start; // temporary index
        //initialize the start index and mid index to be used as counters
        int startIndex = start;
        int midIndex = mid + 1;

        // iterate until the smaller array reaches the end
        while (startIndex <= mid && midIndex <= end) {
            if (numbers[startIndex] < numbers[midIndex]) {
                //++ increases index value by 1 and is used to keep while loop from giving us an infinite loop
                tempArray[tempArrayIndex++] = numbers[startIndex++];
            } else {
                tempArray[tempArrayIndex++] = numbers[midIndex++];
            }
        }

        //copy the remaining elements into the array
        while (startIndex <= mid) {
            tempArray[tempArrayIndex++] = numbers[startIndex++];
        }

        while (midIndex <= end) {
            tempArray[tempArrayIndex++] = numbers[midIndex++];
        }
        //copy the value of our temporary array into the actual array after we are done sorting it
        if (end + 1 - start >= 0) {
            //java method that can be used to copy an array
            System.arraycopy(tempArray, start, numbers, start, end + 1 - start);
        }
    }
}



