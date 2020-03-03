package day05;

public class VariablePractice {
    public static void main(String[] args) {
        // 8 primitive
        /*
        Block comment, everything in between will be seen as comment

         whole numbers        : byte, short, int, long
         fractional numbers  : float, double
         logical             : boolean (true, false)
         character           : char (single character in single quote)

         usually by default for whole numbers : just use int
         usually by default for fractional numbers : just use double

         Is Sting part of Primitive types ? : NOOO!!!!!
         String is sequence of character

       */

        // Task 1: Age calculator
        // given birth year , please calculate the age
        int birthYear = 1982;
        int currentYear = 2019;

        // I was born in year 2019, and I am 37 years old;
        System.out.println(" I was born in year " + 1982 +", and I am " + (2019-1982)  + " years old ");


        int speedLimit = 35;
        int currentSpeed = 55;

        int overTheLimit = speedLimit - currentSpeed ;
        System.out.println("You were driving "+ overTheLimit + " over the speed limit.");





    }
}
