package day12;
import java.util.Scanner;
public class SeasonAction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your season please");
        String season = scan.next();

        if (season.equalsIgnoreCase("spring")) {
            System.out.println("Hiking, Navruz, Allergy Season");
            if (season.equalsIgnoreCase ("summer") ) {
                System.out.println("Pool, Swimming, Vacation");
                if (season.equalsIgnoreCase ("fall") ) {
                    System.out.println("barbeque, Thanksgiving, Hallowen");
                    if (season.equalsIgnoreCase ("winter") ) {
                        System.out.println("Snowing, Skiing, Allergy Season");
                    }



                }




            }

        }
    }

}
