package day10;
import java.util.Scanner;
public class PracticeMcDonald {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("WElcome to Chick Fil a, what would you like to order today?" );
        /*
         1,Cobb Salad
         2,Chicken Soup
         3,Lemonade
         4,Fruit Cup
         5,Mac and Cheese
         */
        String yourOrder = "";
        int number = scan.nextInt();
        switch (number) {
            case 1:
                yourOrder="Cobb Salad";
                System.out.println(" You ordered " + yourOrder);

                break;
            case 2:
                yourOrder="Chicken Soup";
                System.out.println(" You ordered " + yourOrder);

                break;
            case 3:
                yourOrder="Lemonade";
                System.out.println(" You ordered " + yourOrder);

                break;
            case 4:
                yourOrder="Fruit Cup";
                System.out.println(" You ordered " + yourOrder);

                break;
            case 5:
                yourOrder="Mac and Cheese";
                System.out.println(" You ordered " + yourOrder);

                break;
            default:
            System.out.println("Your order is Chicken Soup");










            }
        }


    }


