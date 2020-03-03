package code09;

import java.util.Scanner;

public class IfWithoutElseExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = scan.nextInt();
        if(score<60) {
            System.out.println("Failed the exam");
        }
        System.out.println("Entering exam result");
    }
}
