package repl;
import java.util.Scanner;

public class Repl23 {

    public static void main(String [] args) {
            //YOUR CODE HERE

            Scanner scan = new Scanner(System.in);

            System.out.println("areaCode");
            int areaCode = scan.nextInt();

            System.out.println("localNumber");
            int localNumber = scan.nextInt();

            String phoneNumber = ("My area code is" + localNumber);

            System.out.println("My calling number" + phoneNumber);


        }
    }

