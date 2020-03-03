package repl;
import java.util.Scanner;

public class Repl99 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        //code starts here

        String prefix = str.substring(0, n);
        System.out.println(str.substring(n).contains(prefix));
    }
}