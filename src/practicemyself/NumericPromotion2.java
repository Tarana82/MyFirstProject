package practicemyself;

public class NumericPromotion2 {
    public static void main(String[] args) {

        byte b = 10;
        short sh = 20;
        //short total = b + sh; will not compile
        //when you have smaller data type byte or short, when you do any aritmetic operation with them result will be int

        int total = b + sh;
        System.out.println(total);
    }
}
