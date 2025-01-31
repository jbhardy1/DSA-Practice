package codebyhardy.com;

import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        /** Quick sort is one of the most crucial algorithms, given it has a time
         * complexity of O(n log n) whereas other sorts have O(n^2) sort time */

        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before: ");
        printArray(numbers);

        quickSort(numbers, 0, numbers.length - 1); //call quick sort method, passing in lower bound and choosing
        //last element as pivot. Since you want to sort the whole array, the low bound is alwasy index 0

        System.out.println("\nAfter: ");
        printArray(numbers);
    }

    /**
     * Method to actually sort. Takes the array we're sorting and the low and high indexes
     * **/
    public static void quickSort(int[] numbers, int lowIndex, int highIndex) {
        if(lowIndex >= highIndex){
            return;
        }
        int pivot = numbers[highIndex]; //chose the last element as pivot

        int leftPointer = lowIndex; //create pointers to move through the array from left to right
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){
            while(numbers[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(numbers[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(numbers, leftPointer, rightPointer);
        }
        swap(numbers, leftPointer, highIndex);

        quickSort(numbers, lowIndex, leftPointer - 1);
        quickSort(numbers, leftPointer + 1, highIndex);
    }

    private static void swap(int[] numbers, int index1, int index2){
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
