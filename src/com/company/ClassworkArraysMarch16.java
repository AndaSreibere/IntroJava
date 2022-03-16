package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class ClassworkArraysMarch16 {
    public static void main(String[] args) {
        //Task1: 20 mins. Ask the user to enter a range of numbers and sort that group of numbers in such way that even numbers
        //come first in the output and odd numbers are after the even numbers
        //the sorted version is [2, 4, 8, 10, 5, 9, 7, 3]

        Scanner scanner = new Scanner(System.in);

        // šis risinājums no googles:
        /*System.out.println("How many numbers do you want to enter: ");
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        numbers=separateEvenOddNumbers(numbers);
        System.out.println("Separating even and odd numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
    public static int[] separateEvenOddNumbers(int numbers[])
    {
        int left=0;
        int right=numbers.length-1;
        for (int i = 0; i < numbers.length; i++) {
            while(numbers[left]%2==0) {
                left++;
            }
            while(numbers[right]%2==1) {
                right--;
            }

            if(left<right) {
                int temp=numbers[left];
                numbers[left]=numbers[right];
                numbers[right]=temp;
            }
        }
        return numbers;*/
                                            //Uche risinājums: (tā ari neatrisinaja) paņemt no git
        // prompt the user to enter somne numbers
        /*System.out.println("How many number do you want to enter: ");
        int[] userNumbers = new int[scanner.nextInt()];

        //create counters to count the odd and even numbers entered:
        int evenCount = 0;
        int oddCount = 0;

        //populate the array with data
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("Enter a number: ");
            userNumbers[i] = scanner.nextInt();
            if (userNumbers[i] % 2 == 0) evenCount++;
            else oddCount++;
        }
        //seperate the even and odd:
        int[] evenNumbers = new int[evenCount];
        int[] oddNumbers = new int[oddCount];

        //filter the into their respective arrays
        for (int i = 0; i < userNumbers.length; i++) {
            for (int j = 0; j < evenNumbers.length; j++) {
                if (userNumbers[i] % 2 == 0){
                    evenNumbers[j] = userNumbers[i];
                    break;
                }

            }

        }
        System.out.println(Arrays.toString(evenNumbers));
        System.out.println(Arrays.toString(oddNumbers));*/

//task 2 - write a programm to return the second largest number from a stream of input integers from the user/ 15min

        //Prompt the user for input
       /* System.out.println("How many numbers do you want to enter");
        int[] numbers = new int[scanner.nextInt()]; // use the input to create an array to hold the values

        //Populate the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        //sort the array
        Arrays.sort(numbers);

        System.out.println("The second largest number is " + numbers[numbers.length -2]); // atgriež skaitli, kas atrodas tajā indexā*/






//TASK 3 - write a program to find out if in a list of number entered by user there are not multiples of 3

        System.out.println("How many numbers do you want to enter");
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 ==0) {
                System.out.println("THE ENTERED NUMBER " + numbers[i] + " IS MULTIPLE OF 3");
            } else {
                System.out.println( "The entered number " + numbers[i] + " is not multiple of 3");

            }
        }





    }
}







