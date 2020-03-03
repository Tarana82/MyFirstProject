package repl;
import java.util.*;
public class Repl_29 {

    public static void main(String[] args) {
            //WRITE YOUR CODE HERE

            //Step 1. Create object of Scanner class

            //Step 2. Create and intitialize in variable version. Use scanner.nextDouble() to intitialize.

            //Step 3. Write an if statement

            //Step 1. Create object of Scanner class
            Scanner scan=new Scanner(System.in);

            //Step 2. Create and intitialize in variable version. Use scanner.nextDouble() to intitialize.
            double version;
            version=scan.nextDouble();
            //Step 3. Write an if statement
            if(version>=0){
                System.out.println("Cupcake");
            }
            if(version<=0){
                System.out.println("Pie");
            }else {
                System.out.println("Sorry, I don't know this version!");

            }
        }





    }
