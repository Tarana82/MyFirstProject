package day17;

public class Name {
    public static void main(String[] args) {


        String name = "Tarana";

        int x = name.length() -1;
        while (x >= 0) {
            System.out.print("index "+x+" : ");
            System.out.println(name.charAt(x));
            --x;
        }
    }
    }