package repl;
import java.util.Scanner;
public class Repl90 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE

        Scanner scan = new Scanner(System.in);
        System.out.println("Split:");
        String split = scan.nextLine();

        System.out.println("Number of people:");
        int numPeople = scan.nextInt();

        System.out.println("Check amount:");
        double check = scan.nextDouble();
        scan.nextLine();

        System.out.println("Service Quality:");
        String service = scan.nextLine();

        String people = "";
        for (int i = 0; i < numPeople; i++) {
            people += "&";
        }
        double tip = 0;
        if (service.equalsIgnoreCase("Poor")) {
            tip = check * 0.05;
        } else if (service.equalsIgnoreCase("Fair")) {
            tip = check * 0.10;
        } else if (service.equalsIgnoreCase("Good")) {
            tip = check * 0.15;
        } else if (service.equalsIgnoreCase("Great")) {
            tip = check * 0.20;
        } else if (service.equalsIgnoreCase("Excellent")) {
            tip = check * 0.25;
        }

        System.out.println("Number of people entered: " + people);
        System.out.println("Total to pay: " + (check + tip));
        System.out.println("Total tip: " + tip);
        System.out.println("Total per person: " + ((check + tip) / numPeople));
        System.out.println("Tip per person: " + (tip / numPeople));

    }
}