package practicemyself;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int apples = 1;
         while (apples <= 10) {
             System.out.println("I am eating an apple :)" + apples);
             apples++;

             System.out.println("No more apples :(");

             int number, count;
             Scanner keyboard = new Scanner(System.in);
             number = keyboard.nextInt();
             System.out.println("Enter a number");

             count = 1;
             while (count <+ number){
                 System.out.println(count + ",");
                 count++;


             }
         }
    }
}
