package day21;

public class NestedForLoopAndWhile {
    public static void main(String[] args) {
        for (int j = 0; j < 4; j++) {
            int k=0;
            while (k<3) {
                System.out.print(" IRow " + j + "-Column" + k);
                k++;
            }
            System.out.println();

        }
    }
}
