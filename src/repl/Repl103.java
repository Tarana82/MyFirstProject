package repl;
import java.util.Scanner;
public class Repl103 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //code starts here

        for (; i<=n; ++i) {
            System.out.print("*");
            for (j=1; j<i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
