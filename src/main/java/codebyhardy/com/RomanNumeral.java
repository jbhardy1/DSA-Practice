package codebyhardy.com;

public class RomanNumeral {
    public static void main(String[] args) {
//        int answer = 0, number = 0, prev = 0;
//        String s = "MCMXCIV";
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            switch (s.charAt(i)) {
//                case 'M' -> number = 1000;
//                case 'D' -> number = 500;
//                case 'C' -> number = 100;
//                case 'L' -> number = 50;
//                case 'X' -> number = 10;
//                case 'V' -> number = 5;
//                case 'I' -> number = 1;
//            }
//            if (number < prev) {
//                answer -= number;
//            } else {
//                answer += number;
//            }
//            prev = number;
//        }
//        System.out.println(answer);

        int answer = 0, number = 0, prev = 0; //variables to hold answer, as well as current and previous numbers
        String s = "MCMXCIV"; //numeral string
        for(int i = s.length() - 1; i >= 0; i--){ //for loop to check each character in string
            switch(s.charAt(i)){ // switch statement for each Roman Numeral, also assigns number = to the numerical value of that numeral
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if(number < prev){ //if the current number is less than the previous (I < V) decrease the answer by that much to account for IV, etc.
                answer -= number;
            }
            else{ //else add the current value of the number to the answer
                answer += number;
            }
            prev = number; //set the previous to hold current number before next iteration.
        }
        System.out.println(answer);

    }
}
