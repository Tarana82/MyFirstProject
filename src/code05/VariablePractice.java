package code05;

public class VariablePractice {
    public static void main(String[] args) {
        // 8 primitive data type

        /* start and end
        //Block comment everyting in between will be seen as comment

        whole numbers :       byte, short, int,double
        fractional numbers:   float, double
        logical :             boolean (true, false)
        character :           char (single character in single quote)

        usually by default for whole numbers:   just use int
        usually by default for fractional numbers:   just use double

// teacher personally don't use byte, short, or float in his test. because he don't need big number
        Is STRING part of Primitive types ? : NOOO !!!!
        String is sequence of character
        String is text

        */

        // Task1: age calculator
        // given birth year ,please calculate the age

        int birthYear = 2001;
        int currentYear = 2019;

        // I was born in year 2001, and I am 18 years old;
        System.out.println(" I was born in year " + 2001 + " and I am " + (2019-2001) + " years old " );

        // Task 2: you are speeding today
        // speed limit is some number, and your current speed is this
        // generate this output of : You are driving 10 mph than speed limit
        // speedLimit as int, currentSpeed as int, overTheLimit as int

        int speedLimit = 65;
        int myCurrentSpeed = 95;
        int overTheLimit = myCurrentSpeed - speedLimit   ;

        System.out.println(" I am driving " + overTheLimit + " mph more than speed limit. ");

        System.out.println("I was driving " + myCurrentSpeed + " mph more than speed limit was " + speedLimit + " MPH, " + " that means I was driving " + overTheLimit + " over the limit ");



    }
}
