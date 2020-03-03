package repl;
import java.util.Scanner;
public class Repl104 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();
        //code starts here

        int fn = json.indexOf("firstName");
        int fncomma = json.indexOf(",", fn); //first comma after first name
        int ln = json.indexOf("lastName");
        int lncomma = json.indexOf(",", ln); //first comma after last name

        System.out.println("First name: " + json.substring(fn+13, fncomma-1));
        System.out.println("Last name: " + json.substring(ln+12, lncomma-1));

    }
}
