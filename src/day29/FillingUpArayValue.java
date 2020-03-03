package day29;

import java.util.Arrays;

public class FillingUpArayValue {
    public static void main(String[] args) {
        // create an array with size 100 and fill it up as below

        int[] numbers = new int[100];
        System.out.println( Arrays.toString(numbers) );
        //  numbers[0] = 1 ;
        //  numbers[0] = 2 ;
        //  numbers[0] = 3 ;
        //  .....

        // numbers[99] = 100;

        for (int x = 0; x < numbers.length; x++) {
            numbers[x] = x + 1 ;
        }

        System.out.println("After filling up \n" + Arrays.toString(numbers) );


    }
}


