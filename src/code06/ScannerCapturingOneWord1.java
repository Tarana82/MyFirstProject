package code06;

import java.util.Scanner;

public class ScannerCapturingOneWord1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    System.out.println (" What is your name ? ");

    String name = scan.next();

    int age = scan.nextInt();
        System.out.println("You have entered " + name);

        System.out.println( " You have entered age " + age);



    }
}
