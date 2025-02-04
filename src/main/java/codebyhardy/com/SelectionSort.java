package codebyhardy.com;

import java.util.Arrays;
import java.util.Collections;

public class SelectionSort {
    /** Goes through the array to find the lowest value,
     * then moves to the front of the unsorted part of the array **/

    public static void main(String[] args){
        int[] nums = {64, 34, 25, 12, 22, 11, 90, 5};
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
                int temp = nums[i]; //you need a temp variable to hold the data, so it's not overwritten
                nums[i] = nums[minIndex]; 
                nums[minIndex] = temp;
            }
        }

        System.out.println(Arrays.toString(nums));

    }


}
