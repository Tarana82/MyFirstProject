package day21;

public class NestedDoWhil {
    public static void main(String[] args) {

        int i1 = 0;
        do {
            i1++;
            int j = 0;
            do {
                j++;
                System.out.println(" IRow" + i1 + "-Column" + j);
            } while (j < 3);
            System.out.println();
        } while (i1 < 5);
    }
}