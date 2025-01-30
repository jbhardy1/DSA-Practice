package codebyhardy.com;

public class BubbleSort {

    public static void main(String[] args) {
        //practice with Bubble Sort and Arrays
        //time complexity is always O(n^2) due to the nested for loop iterating through and comparing the elements of different indexes.

        int[] myArray = new int[]{7,14,11,8,9}; //initialize unsorted array
        System.out.println("Before Sorting: ");
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }

        int trackNum = 0; //variable to hold array value
        boolean isSwapped  = false; //boolean to track if swapping occurs on inner for loop

        for(int i = 0; i < myArray.length - 1; i++){ //initial for loop to iterate through the list one at a time
            for(int j = 0; j < myArray.length - 1; j++){ //secondary for loop to iterate through and allow comparison at index j
                if(myArray[j] > myArray[j + 1]){ //if the int at the next element is greater
                    trackNum = myArray[j]; //store before overwriting
                    myArray[j] = myArray[j + 1]; //update data at index
                    myArray[j + 1] = trackNum; //update data at index with stored value
                    isSwapped = true; //we swapped, so true
                }
            }
            if(!isSwapped){//after inner loop finishes, if nothing was swapped then it's already sorted so break
                break;
            }
        }
        System.out.println("\nAfter sorting: ");
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " "); //for loop to print each sorted element
        }
    }

}