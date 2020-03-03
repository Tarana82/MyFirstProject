package code10;

public class MultiBranchWithSwitch {
    public static void main(String[] args) {
        System.out.println("Welcome to McDonald , what can I get for you");
        String order = "" ;
        int itemNumber = 35 ;

        switch (itemNumber) {
            case 11 :
            System.out.println("You have selected 11");
            order = "Burger";
            break;
            case 5 :
                System.out.println("You have selected 5");
            order = "French Fry";
        break;
            case 8:
            System.out.println("You have selected 8");
            order = "Nuggets";
        break;
            case 35 :
            System.out.println("You have selected 35");
                System.out.println("YAY!!! YUM!!! ");
            order = "Ice Cream";
                    break;
            default:
                System.out.println("YOU HAVE SELECTED UNKNOWN ITEM");
                order = "Unknown" ;
                break;
        }
        System.out.println("Your order is " + order);

    }
}


