package day21;

public class NestedForEachLoop {
    public static void main(String[] args) {
         /* Nested loop is loop inside another loop

         //a nested for loop
          */
         for (int r =0; r < 2; r++) {

             for (int k = 0; k < 3; k++) {
                 System.out.println(" IRow"+ r + "-Column"+k + "I");
             }
             System.out.println();
         }
    }
}
