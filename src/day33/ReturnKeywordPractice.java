package day33;

public class ReturnKeywordPractice {
    public static void main(String[] args) {

        System.out.println(calculateAndReturnAge(1982));

    }

    public static int calculateAndReturnAge(int i) {
        int age = 0;
        if (i >= 1900 && i <= 2020) {
            return 2020 - i;
        } else {

            return age;
        }
    }
}



      /*  Create a class called ReturnKeywordPractice with main
                calculateAndReturnAge
                Write a method accept a birth year and return the age :
        the birth year should be within the range of 1900-2020
        if not return 0
        optionally : test your code against array of birthYears
        {1999,122,2019, 1987, 1978,1964,3999, 2004}

       */



