package day26;

import java.util.Arrays;

public class StringSplitPractice {
    public static void main(String[] args) {
        String students = "Tarana, Ismail,Senan,Asad, Ahmadov,Ahmadova"  ;
        students = students.replace(    " ", "") ;
        System.out.println("students = " + students);

        String [] namesArrays1 = students.split(   ",");

        System.out.println(Arrays.toString(namesArrays1)  );
        System.out.println("length of namesArrays1 is " + namesArrays1.length);

        // first get all the name into String array called namesArray

        //Spell the name of each person in this format
        // T-a-r-a-n-a- .....
        //I-s-m-a-i-l- .....
        //S-e-n-a-n- .....
        //A-s-a-d= .....
        //A-h-m-a-d-v- .....
        //A-h-m-a-d-o-v-a

        // Optionally count a from each name and print

    }
}
