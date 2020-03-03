package day24;

import java.util.Arrays;

public class ArraysClassMethod {
    public static void main(String[] args) {

        // Arrays class a class coming from java.util package
        // it has a lot of pre-built method to work with array object

        // for printing the content of the array
        // toString  --->> Arrays.toString(yourArrayHere)
        // This method will give you string representation of any type of array
        // the result will look --->>   [item1 , item 2 , item 3 ...... lastItem]


        String[] superHeros = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};
        //System.out.println( superHeros );
        System.out.println("Arrays.toString(superHeros)    result :     ");
        System.out.println(Arrays.toString(superHeros));
        // saving the string result into a variable and print
        String superHerosAsString = Arrays.toString(superHeros);
        System.out.println(" superHerosAsString    result :     ");
        System.out.println(superHerosAsString);

        // how do we get first character of superHerosAsString variable
        System.out.println(" superHerosAsString.charAt(0)   result :     ");
        System.out.println(superHerosAsString.charAt(0));

        int[] numbers = {10,44,55,3,78} ;
        System.out.println("Arrays.toString(numbers) RESULT : ") ;
        System.out.println(Arrays.toString(numbers) );

        // create an double array of 3 items ; and put 3 value
        // get a string representation out of this array and save it as pricesString
        //print each and every character in this String in this format
        //for example : your first 2 line of output should look like this
        // character at index 0 is : yourCharacterHere
        // character at index 1 is : yourCharacterHere and so on all the way till last



        // for sorting an array in ascending order
        // sort    --->>  Arrays.sort(yourArrayHere)

        // for checking for equality of 2 array object content
        // equals  ---->> Arrays.equals(firstArray,secondArray)

    }
}
