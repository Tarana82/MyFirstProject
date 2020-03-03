package code09;

public class LanguagePicker {
    public static void main(String[] args) {
        System.out.println("Welcome to Cybertek Call Center ");
        System.out.println("Please select your language option from 1-7");

        int greetingCode = 1 ;
        String greeting = "" ;

        if (greetingCode == 1) {
            greeting = "Salam";
        }else if (greetingCode == 2) {
            greeting = "Privet";
        }else if (greetingCode == 3) {
            greeting = "Bonjour";
        }else if (greetingCode == 4) {
            greeting = "Merhaba";
        }else if (greetingCode == 5) {
            greeting = "Hola";
        }else if (greetingCode == 6){
            greeting = "Hello";
        }else if (greetingCode == 7) {
            greeting = "Hi";
        }else {
            greeting = "Unknown";
        }
        greeting = greeting + " , SDET ";

        System.out.println("This is how the greeting message you get : "+ greeting);


}


    }

