package day12;
import java.util.Scanner;
public class FizzBuzzNumberCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int number = 30;
        if (number % 5 == 0) {
            System.out.println("FizzBuzz number");
        } else if (number % 5 == 0)
            System.out.println("Fizz number");
    else if (number%3==0)
                System.out.println("Buzz number");
            else
                System.out.println("It is not FizzBuzz number");
        }
    }


