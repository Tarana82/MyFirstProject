package day21;

public class NestedWhileLoop {
    public static void main(String[] args) {


        // a nested while loop
        int i = 0;
        while (i < 5) {
            i++;
            int j = 0 ;
            while(j<3) {
                j++;
                System.out.println(" IRow"+i+"-Column" +j);
            }
            System.out.println();
        }
    }
}

