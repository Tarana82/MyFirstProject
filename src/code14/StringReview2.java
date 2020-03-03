package code14;

public class StringReview2 {
    public static void main(String[] args) {

        String str = "I like Pumpkin" ;
        System.out.println("str");
      //  anything inside quotation is string
        System.out.println(str);
      //  without quatotation is variable
        System.out.println("str = " + str);

       // System.out.println(  str.equals("pumpkin")  );
        System.out.println("Does it contains Pumpkin : ");

        System.out.println(   str.contains("Pumpkin")       );

        boolean gotPumpkin = str.contains("Pumpkin");
         //soutv+enter
        System.out.println("gotPumpkin = " + gotPumpkin);

        // startWith endsWith
        // check whether a string start with another string
        // check whether a string end with another string
        // and return true or false result*/

        boolean startedWithI = str.startsWith("I") ;
        System.out.println("started With I = " + startedWithI);

        boolean endWithPumpkin = str.endsWith("Pumpkin") ;
        System.out.println("endWithPumpkin = " + endWithPumpkin);

        // Password Validator

        // Minimum 8 char max 16 char
        //It must contains _ or $
        // it must not contains space
        // it must start Ab

        // if any of above condition does not match say Invalid Password
        // else say Good Password !
        String password = "Ab_12321$12csa";
        //Minimum 8 char max 16 char
        boolean min8max16 = password.length() >=8 && password.length() <+16 ;

        // It must contains _ or $
        boolean mustContains_or$ = password.contains("_") || password.contains("$") ;
        // password.contains("_")  \\ password.contains("$")

        //It must not contains space
        boolean mustNotContainsSpace = ! password.contains(" ") ;

        // password.contains(" ")
        // it must start Ab
        boolean mustStartsWithAb = password.startsWith("Ab") ;
        //password.startWith("Ab")

        if(min8max16 && mustContains_or$ && mustNotContainsSpace && mustStartsWithAb) {
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }





    }
}
