package day21;

public class NestedLoop {
    public static void main(String[] args) {

       /* // nested for loop
        for (int i = 0; i < 4; i++) {
            //  System.out.println("Row"+i);
            System.out.println();

            for (int j = 0; j < 3; j++) {
                System.out.print("IRow " + i + "-Column" + j); */

        /*// for each loop
        int[] cols = {1, 2, 3};
        int[] rows = {1, 2, 3, 4};

        for (int row : rows) {
            System.out.println("row " + row);


            for (int column : cols) {
                System.out.println(" IRow " + row + "column " + column);*/


        int row = 0;
        while (row < 5) {
            row++;
            System.out.println("Row " + row);
        }
        int col = 0;
        while (col < 5) {
            col++;
            System.out.println("Column " + col);
        }

    }
}

