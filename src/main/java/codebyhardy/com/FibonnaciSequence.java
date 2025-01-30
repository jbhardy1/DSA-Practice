package codebyhardy.com;

public class FibonnaciSequence {

    public static void main(String[] args) {
        //sequence involves adding the previous two numbers together to get the next
        // 0, 1 to start.

        int target = 18; //we want the 18th number in the sequence
        int num1 = 0; //variable to track first number in the sequence
        int num2 = 1; //variable to track the second number in the sequence
        int newNum = 0; //variable to track the new number, created by adding num1 and num2 together
        int i = 0; //to keep printing until we get to target

        System.out.print("The sequence leading up to " + target + " is: ");
        while(i < target){ //while our tracking number is <= target, non-inclusive since we only want up to the 18th
            System.out.print(newNum + " "); //print number in the sequence
            newNum = num1 + num2; //calculate the new number by adding num1 and num2
            num1 = num2; //update num1 to be the next number in sequence
            num2 = newNum; //update num2 to be th next number in sequence
            i++; //increment i to ensure it's not an infinite loop
        }
        FibonnaciSequence main = new FibonnaciSequence(); //initialize object to run method
        System.out.println("\nThe 18th number is: " + main.fib(target)); //call method and pass in target

    }

    //can also be done recursively through a breakout method
    public int fib(int target){
        if(target <= 1){ //always check if it's less than or equal to 1, since those are always the first two numbers in the sequence
            return target;
        }
        else{ //if it isn't, recursively call the method
            return fib(target - 1) + fib(target - 2);
        }
    }
}
