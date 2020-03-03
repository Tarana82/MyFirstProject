package day21;

public class WarmUpTask1_NamePrinter {
    public static void main(String[] args) {
      /*  Create a class called WakeUpTask1_NamePrinter
                Given your name stored in a variable myName as String
        for example :  String myName = "My name is Yourname here" :
        1, loop through each and every character print them out like this :  M->y-> >n->a->m->e-> and so on
        put arrow in beterrn the character
        Optionally*/

      String myName = "My name is Tarana Ahmadova";

      int charCount = myName.length() ;
      System.out.println("charCount = " + charCount);
      int lastCharIndex = charCount -1 ;
        System.out.println("lastCharIndex = " + lastCharIndex);

      for (int x = 0; x <= lastCharIndex ; x++) {

          System.out.println(myName.substring(x , x+1) + "->");


      }


    }
}
