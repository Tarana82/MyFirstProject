package code09;
import java.util.Scanner;

public class IfElseCodeExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = scan.nextInt();
        if(score>60) {
            System.out.println("Passed the exam");
        }else {
            System.out.println("Failed the exam");
        }
    }

}
