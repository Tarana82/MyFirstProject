package repl;
import java.util.Scanner;
public class Repl102 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();
        //code starts here

        int start = html.indexOf("id");
        int end = html.lastIndexOf("\"");

        if (html.contains("html")) {
            System.out.println(html.substring(start + 4, end));
        } else {
            System.out.println("Invalid input!");
        }
    }
}