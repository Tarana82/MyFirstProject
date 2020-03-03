package code13;

public class StringMethodsToUpperToLowerCase {
    public static void main(String[] args) {
        /*String s1 = "salam" ;
        System.out.println(   s1.equals("abc")    );

        System.out.println(   s1.equalsIgnoreCase("SALAM")   );


        System.out.println(        s1          );
        System.out.println(       s1.toUpperCase()             );

        System.out.println(      s1.toLowerCase()    ); */

        String s1 = "Tarana" ;
        System.out.println(   s1.equalsIgnoreCase(     "TARANA")   );
        System.out.println( "My name is " + s1.toUpperCase()     );
        System.out.println(     s1.toLowerCase()    );
        System.out.println(    s1.length()   );

        int lengthOfStr = s1.length() ;

        if( lengthOfStr > 4) {

            System.out.println(" More than 4 character");
        }else{
            System.out.println("NOT MORE THAN 4");
        }
    }
}
