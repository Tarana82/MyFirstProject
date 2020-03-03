package day09;

public class Greeting {
    public static void main(String[] args) {
        int greetingCode = 1;
        String dayName = ""; // assigning a empty String value

        String greeting ="";
        int languageCode = 1;
        if (greetingCode == 1) {
            greeting = "Salam";
        } else if (greetingCode == 2) {
            greeting = "Hello";
        }else if (greetingCode == 3) {
            greeting ="privet";
        }else if (greetingCode == 4) {
            greeting = "Privet";
        } else if (languageCode == 5){
            greeting = "Merhaba";
        }else if (languageCode == 6) {
            greeting = "hola";
        }else if (languageCode == 7) {
            greeting = "Bonjour";
        }else{
            greeting = "Unknown";
        }
        System.out.println(greeting + ", SDET");
    }

}
