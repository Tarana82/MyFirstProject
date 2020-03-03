package repl;
import java.util.Scanner;
public class Repl97 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //code starts here

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.substring(i).startsWith("java")) {
                count++;
            }
        }
        System.out.println(count);
    }
}