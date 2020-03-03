package day22;

public class Task2 {
    public static void main(String[] args) {

        byte[] data = new byte[4];
        data[0] = 56;
        data[1] = 65;
        data[2] = 79;
        data[3] = 99;


        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);


        data[1] = 77;
        System.out.println(data[1]);
    }
}
