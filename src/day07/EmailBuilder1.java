package day07;

import java.util.Scanner;

public class EmailBuilder1 {
    public static void main(String[] args) {


        // create a class called EmailBuilder with main method

// create 3 String variable for first name  last name , company
// create another variable for email
// create email in this format firstName_lastName@company.com

// print out the result as , my name is <your full name> and I work for <company> and my email is <email>


        Scanner scan = new Scanner(System.in);

        String firstName = "Tarana";
        String lastName = "Ahmadova";
        String company = "Apple";
        String email = "tarana-ahmadova@apple.com";

        System.out.println(" My name is " + firstName + " " + lastName + " and I work for " + company + " "
                + "and my email is " + email);

    }

}
