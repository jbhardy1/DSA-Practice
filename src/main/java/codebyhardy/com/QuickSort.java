package codebyhardy.com;

public class QuickSort {

    public static void main(String[] args) {
        /** Quick sort is one of the most crucial algorithms, given it has a time
         * complexity of O(n log n) whereas other sorts have O(n^2) sort time */
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        quickSort(arr, 0, n - 1);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    //You need a partition method to track the index of the smaller elements and keep swapping
    public static int partition(int[] arr, int low, int high){

        int pivot = arr[high]; //choose the pivot

        int i = low - 1; //set index of smaller element

        //travers the array and move smaller elements to left side
        for(int j = low; j < high - 1; j++){
            if (arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }

        //move pivot after smaller elements and return its position
        swap(arr, i + 1, high);
        return i + 1;
    }

    //a function to swap the elements
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //actual implementation of the quicksort
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){

            //pivot is the partition return index of pivot
            int pivot = partition(arr, low, high);

            //recursion calls for smaller elements and greater or equal elements
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }
}
