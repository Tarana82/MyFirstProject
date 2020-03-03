package day05;
import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {

        // ask user for name
        // print your is is
        // ask user for birth year
        // print the age !!
        // ask user for height
        // and capture the result
        // print the height !!
        // Create scanner object

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name : ");

        //String name = "Sam" ;
        String name = scan.next ();
        System.out.println("My name is  " + name );

        System.out.println("What is your birth year : ");
        int birthYear = scan.nextInt();
        int age = 2019 - birthYear;


        System.out.println("Your age is : " + age );

        System.out.println("Your age is : "  + age );
        System.out.println("what is your height ? ");
        double height = scan.nextDouble();
        double measure = 5.7;

        System.out.println("your height is : " + height);










    }
}
