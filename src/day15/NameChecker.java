package day15;
import java.util.Scanner;

public class NameChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name please : ");
        String name = scan.next();

        int lengthOfTheName = name.length();
        System.out.println("lenth Of The Name = " + lengthOfTheName);

        if (lengthOfTheName <4) {
            System.out.println("Short Name" );
        }else if(lengthOfTheName >= 4 && lengthOfTheName <= 11 ) {

            System.out.println("Medium Name" );
        }else {
            System.out.println("Longer");
        }
        //------------------------------
        // true || true --->> true
        if (name.contains("a") || name.contains("e")) {
            System.out.println(" name contains a or e ");
        } else {
            System.out.println(" i dont have both a or e in my name  ");
        }


    }




    }

