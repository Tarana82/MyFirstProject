package repl;
import java.util.*;
public class Repl35 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String item = scan.nextLine();

            //WRITE YOUR CODE HERE
            int giftCard=100;

            int smartphone = 300;
            int laptop = 400;
            int charger = 15;
            int usbCable = 10;
            int headphones = 30;
            int pants = 50;
            int hat = 25;
            int socks = 5;
            int blanket = 60;
            int pillow = 40;

            if (item.equals("Smartphone")) {
                System.out.println("Sorry, not enough funds on your gift card!");
            }else if (item.equals("Laptop")){
                System.out.println("Sorry, not enough funds on your gift card!");
            }else if(item.equalsIgnoreCase("Charger")) {
                System.out.println("Thank you for your purchase!\n Your current balance is: "
                        +(100-charger));
            }else if(item.equalsIgnoreCase("USB cable")){
                System.out.println("Thank you for your purchase!\n Your current balance is: "+(100-usbCable));
            }else if(item.equalsIgnoreCase("Headphones")){
                System.out.println("Thank you for your purchase!\n Your current balance is: "+(100-headphones));
            }else if(item.equalsIgnoreCase("Pants")){
                System.out.println("Thank you for your purchase!\n Your current balance is: "+(100-pants));
            }else if(item.equalsIgnoreCase("Hat")){
                System.out.println("Thank you for your purchase!\n Your current balance is: "+(100-hat));
            }else if(item.equalsIgnoreCase("Socks")){
                System.out.println("Thank you for your purchase!\n Your current balance is: "+(100-socks));
            }else if(item.equalsIgnoreCase("Blanket")){
                System.out.println("Thank you for your purchase!\n Your current balance is: "+(100-blanket));
            }else if(item.equalsIgnoreCase("Pillow")){
                System.out.println("Thank you for your purchase!\n Your current balance is: "+(100-pillow));
            }else{
                System.out.println("Invalid item!");}
        }

    }


