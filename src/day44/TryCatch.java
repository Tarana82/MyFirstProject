package day44;

public class TryCatch {
    public static void main(String[] args) {


        System.out.println("AFTER TRY CATCH");
        try{
            System.out.println("In second Try block");
            String str = "java is fun!"; str: //"java "
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));
        } catch (Exception e){
            System.out.println("Exception happened in Try Block and caught!");
        }
    }
}
