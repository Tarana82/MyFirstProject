package day06;
 import java.sql.SQLOutput;
 import java.util.Scanner;

public class NextLine_Next_MixtureProblem {

    public static void main(String[] args) {

        Scanner tea = new Scanner(System.in);

        System.out.println(" What is your name? ");
        String name = tea.nextLine();
        System.out.println(" Your name is " + name);

        System.out.println(" What is your age? ");
        int age = tea.nextInt();
        //String age = tea.nextLine();
        //notice we are not storing this into variable
        //we just want below line to capture ENTER keyboard input
        //so that it does not accidentally get captured by
        //the nextLine we use to capture address
        tea.nextLine();
        System.out.println(" Your age is " + age);

        System.out.println(" What is the address?");
        String address = tea.nextLine();
        System.out.println("Your address is " + address);








    }

}
