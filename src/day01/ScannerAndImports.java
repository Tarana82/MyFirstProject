package day01;


import java.util.Scanner;

public class ScannerAndImports {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String firstName = input.next();
        System.out.println("Nice to meet you," + firstName);

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println(age +"---That's quite old!");
    }
}
