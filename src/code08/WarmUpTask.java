package code08;

public class WarmUpTask {
    public static void main(String[] args) {

    /*
    Voting eligibility Program

    Create a variable called age as int

    check whether this age is more than 18
    if yes print : you are raedy to vote !!!
    if it's less than 18 print wait until you are 18
    */
        int age = 27;

        System.out.println(age >= 18);

        if (age >= 18) {

            System.out.println("You are ready to vote");
        } else {
            System.out.println("Wait until you are 18!");



        }

    }
}