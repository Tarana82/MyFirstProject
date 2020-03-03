package day06;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double regularPrice;
        double salePrice;
        double discount;

        System.out.println("What is the regular price?");
        regularPrice = scan.nextDouble();

        System.out.println("What is the discount rate?");
        discount = scan.nextDouble();

        salePrice = regularPrice -regularPrice * discount;

        System.out.println(" Your sale price is " +regularPrice + "$ , you got discount is " +discount+ " and your got deal for " + salePrice +"$");


    }
            }