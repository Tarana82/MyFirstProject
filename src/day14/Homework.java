package day14;

public class Homework {
    public static void main(String[] args) {
//        Task 3 :
//        given 3 whole numbers variable num1, num2 , num3 with value already set .
//        Write a program to
//        find out the largest number and print the result
        int num1 = 10, num2= 35 , num3 = 25;
        int max =0;
        if(num1>num2 & num1>num3){
            max=num1;
            System.out.println(num1 +" is the largest number");
        }else if(num2>num1 & num2 >num3){
            max=num2;
            System.out.println(num2 + " is the largest number");
        }else if(num3>num1 & num3 >num2) {
            max=num3;
            System.out.println(num3 +" is the largest number");
        }
    }
}

