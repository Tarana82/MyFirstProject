package repl;
import day09.OddNumber;

import java.util.Scanner;

public class Repl25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        //CODE HERE
        System.out.print("Enter a number: ");
        int num = input.nextInt();
            if(num % 2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
    }
}