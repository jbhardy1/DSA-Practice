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

        int answer = 0, number = 0, prev = 0;
        String s = "MCMXCIV";
        for(int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)){
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if(number < prev){
                answer -= number;
            }
            else{
                answer += number;
            }
            prev = number;
        }
        System.out.println(answer);
    }
}
