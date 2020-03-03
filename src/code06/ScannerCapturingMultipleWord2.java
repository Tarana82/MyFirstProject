package code06;
import java.util.Scanner;
public class ScannerCapturingMultipleWord2 {
    public static void main(String[] args) {
        Scanner blabla = new Scanner(System.in);

        System.out.println(" What is your name ?");
        String name = blabla.nextLine();
        System.out.println(" You have entered: " + name);


        System.out.println( " What city you live in , including state ?");
        String cityAndState = blabla.nextLine();
        System.out.println( "Your have entered City and State : " + cityAndState );

        System.out.println("What is your street address ? ");
        String streetAddress = blabla.nextLine();
        System.out.println( "Your street addrees is: " + streetAddress );


    }

}
