package repl;
import java.util.Scanner;

public class Repl86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // your code
        // ------------------------------------------

        System.out.println("Please enter guest name:");
        String guests = input.nextLine();
        System.out.println("Do you want to enter new guest name:");
        String answer = input.nextLine();

        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Please enter guest name:");
            String name = input.nextLine();
            guests =guests + ", " + name;
            System.out.println("Do you want to enter new guest name:");
            answer = input.nextLine();
        }

        System.out.println("Guest's list: " + guests);
    }
}

