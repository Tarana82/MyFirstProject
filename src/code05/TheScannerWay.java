package code05;
import java.util.Scanner;
public class TheScannerWay {

    public static void main(String[] args) {

        // ask user for age name
        // print your name is
        // ask user for birth year
        // and capture the result
        // print the age !!
        // ask user for height
        // and capture the result
        // print the height !!

        // create scanner object
        // you can name your variable whatever you want
        // in below case we are calling it scan
        // Scanner is data type , scan is the name , new Scanner (System.in) is value

        Scanner scan = new Scanner(System.in);

        System.out.println(" What is your name ? ");
        //String name = "Tarana";
        String name = scan.next();
        System.out.println(" My name is " + name);
        // Getting single word as String -> scan.next();

        System.out.println("What is your birth year :");
        int birthYear = scan.nextInt();
        int age = 2019 - birthYear;

        System.out.println(" I am " + age + " old years ");
        // Getting single number as int -> scan.nextInt();

        System.out.println(" What is your height ? ");
         double height = scan.nextDouble();
         System.out.println(" Your height is " + height);


        //Getting single fractional number as double -> scan.nextDouble();
        //Getting single fractional number as float -> scan.nextFloat();
        // Getting single true or false boolean -> scan.nextBoolean();


    }

    }

