package day07;

public class CastingTheCharacter {
    public static void main(String[] args) {
        //Look ASCII Table

        char grade = 'B';
        System.out.println(grade);

        //'B' is represented by 66 in ascii table  //look at ascii table
        // here type char is automatically widened to int
        // and stored as number
        int letterInNumber = 'B';
        System.out.println(letterInNumber);

        int letterInNumber2 = 'b';
        System.out.println(letterInNumber2);

        // -------------------------------
        // saving the number as char
        // so we can get the character representation
        // of the number in ascii table
        char myFirstChar = (char) 100;
        System.out.println(myFirstChar);

        // find out your number of each character in your first name
        // this is implicitly turning 'A' to it's number representation in ascii table

        int firstCharNum = 'A'; // you may also write it as  int firstCharNum = (int)'A' ;
        System.out.println("number of letter A is " + firstCharNum);

        // or OPTIONALLY you can directly cast it to number and print
        System.out.println("number of letter K is " + (int) 'K');


        char letterA = 'a';
        //  adding a character to a int number will result in int
        //  (int) letterA   + 1
        System.out.println(letterA + 1);

        System.out.println(" " + letterA + 1);//casting to string you get as a text, a1




    }
}
