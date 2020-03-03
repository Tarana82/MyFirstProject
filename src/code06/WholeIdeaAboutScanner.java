package code06;

import day04.ArithmeticOperator;

public class WholeIdeaAboutScanner {
    public static void main(String[] args) {
/*
        ArithmeticOperators: + - * / %

        Remainder operator is the remaining part of whole number division

        10 / 3 = 3 ---> int / int ---->> int
        10 % 3 = 1 ----> 3 * 3 + 1 = 10

        Scanner nextLine() methods
        It will capture whole line (until user press Enter on keyboard)

        How to capture single word and save it as String ----->> next();
        if you only have one word just use next instead of nextLine

        whole number : nextInt(), nextByte(), nextShort()
        fractional number: nextFloat() , nextDouble();
        THERE IS NO nextChar()
        boolean value ----->> nextBoolean()

        The problem with mixing nextX() and nextLine()

        Whenever you use nextLine after nextX() methods,
        It will "accidentally" capture the "Enter keyboard press" to create the confusion of nextLine() methods is not working

        The solution is: just add another scan.nextline() just to capture that Enter keyboard without saving it into variable

        BOTTOM LINE: DO NOT USE NEXTLINE Unless raelly have to capture more than one word or use above technic to fix the issuses.


       Shorthand/Compound Operator

       int score = 10 ;
       score = score + 4;

       += , -= , *= , /= , %= NO SPACE IN BETWEEN !!!!!

       score+=4; // ----->> 14
       score *=3; // 42
       score /=2: // 21
       score%=5; //5*4+1=21 ------>>remainder is 1

       // ------The special case of increasing and decreasing numbers by 1
       // ------->> increment and decrement operator come in : ++ --

       ++ is called increment operator
       It's very different from just +, because it takes two numbers and add tehm
       ++ will take one number variable and increase the value by 1

       5 + 7 = 12; GOOD!
       5 ++ 7 = --->> ERROR!!!!
       score++ ---->> good! Increment the score by 1

       ++ - - CAN ONLY BE USED FOR NUMBER VARIABLE

       int offer = 2;

       offer +=1; //3
        ++ offer ; //4 ++ will increase the number variable by 1 in shortcut













 */
    }
}
