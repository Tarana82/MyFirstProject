package repl;
import java.util.Scanner;
public class Repl36 {
    public static void main(String[] args) {


        int seniorCitizens, nonSeniorCitizen, age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:" );
        int count = scan.nextInt();
        int count2 = scan.nextInt();
        System.out.println("What is new citizen's age?" );
        age = scan.nextInt();


        if (age >= 65) {
            System.out.println("Senior Citizen" );
            count = count + 1;
            System.out.println("New seniorCitizens " + "count " + count);
            System.out.println("New nonSeniorCitizens " + "count " + count2);
        } else if (age < 65) {
            System.out.println("Non-Senior Citizen" );
            count2 = count2 + 1;
            System.out.println("New seniorCitizens " + "count " + count);
            System.out.println("New nonSeniorCitizens " + "count " + count2);

        }
    }
}



