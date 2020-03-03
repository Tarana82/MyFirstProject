package repl;

public class Repl85 {
    public static void main(String[] args) {

        int counter = 1;

        while (counter <= 20) {
            if (counter % 3 == 0) {
                System.out.print(counter + " ");
            }
            counter++;
        }
    }
}