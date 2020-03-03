package day21;

public class BreakStatement {
    public static void main(String[] args) {

        /* break;               break out of the loop

        continue;               skip current iteration
       */
        // break Statement
         for(int i = 0;  i < 10;  i++) {
             if(i==5) {
                 break;
             }
             System.out.println("Numbers " +i);
         }
    }
}
