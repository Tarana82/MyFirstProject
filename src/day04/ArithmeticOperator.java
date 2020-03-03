package day04;

import jdk.swing.interop.SwingInterOpUtils;

public class ArithmeticOperator {
    public static void main(String[] args) {
        System.out.println(5 + 3); //8
        System.out.println(5 - 3); //2
        System.out.println(5 * 3); //15
        System.out.println(5 / 3); //1

        System.out.println(5 + 3.0d); //8
        System.out.println(5 - 3.0d); //2
        System.out.println(5 * 3.0d); //15
        System.out.println(5 / 3.0d); //1
        System.out.println(5 / 3.0f); //1

        int y =15;
        float x = 7.00f;
        float divide = y/x;
        System.out.println( divide);

         int num1=5;
         double num2= 3.0d;
         float num3 = 3.0f;

         double result1 = num1 +num2; // 5+3.0d - 8.0 you get 8.o, because double variable is fractional
        double result2 = num1 +num2; //5-3.0d - 2.0 you get 2.o, because double variable is fractional
        double result3 = num1 * num2;//5*3.0d - 15.0 you get 15.o, because double variable is fractional
        double result4 = num1 /num2;//5/3.0d - 1.6 you get 1.6, because double variable is fractional
        float result5 = num1 /num3;//5+3.0d - 1.6 you get 1.6, because double variable is fractional

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);



    }
}
