package code05;

import java.util.Scanner;

public class TemperatureConverter {
     public static void main(String[] args) {

         Scanner blabla = new Scanner(System.in);

         System.out.println("What is the temperature in F ? ");

         double fahrenheit = blabla.nextDouble();

         double celsius = (5.0 / 9) * (fahrenheit - 32);

         // fahrenheit 80 is 23 in celsius
         System.out.println( "fahrenheit " + fahrenheit + "is" + celsius + "in celsius");

         }


    }


