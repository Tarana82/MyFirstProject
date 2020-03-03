package code10;

public class Answer {
    public static void main(String[] args) {

        //Create a class called Answer with main
        //Create a variable called myAnswer as String with value of empty string
        //Create a variable called myNumber and assign any value
        // If the number can be divided by 5 without remainder
        //Assign myAnswer value to Fizz Number(just a text,no meaning)
        //If not assign the value to not a Fizz Number
        //Outside if else statement:
        //print my number is 20, it is Fizz Number<>


        String myAnswer = "";
        int myNumber = 46;

        if (myNumber % 5 == 0) {
            myAnswer = "Fizz Number";

        } else {

            myAnswer = "Not a Fizz Number";

            System.out.println("My number is " + "Not a Fizz Number ");

        }
    }
}
