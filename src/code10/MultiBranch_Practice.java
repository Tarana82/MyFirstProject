package code10;

public class MultiBranch_Practice {
    public static void main(String[] args) {
        // AT the McDonald Drive thru
        System.out.println("Welcome to McDonald , what can i get for you");
        /*
        11,Burger
        5, French Fry
        8,Nuggets
        35,Ice Cream
        55,Coke
        //what data type of variable I can use her e
        //byte, short, int, char, String
         */
        String order = "" ;
        int itemNumber = 35 ;

        if(itemNumber == 1) {
            System.out.println("You have selected 11");
            order = "Burger";
        }else if (itemNumber == 5) {
            System.out.println("You have selected 5");
            order = "French Fry";
        }else if (itemNumber == 8) {
            System.out.println("You have selected 8");
            order = "Nuggets";
        }else if (itemNumber == 35) {
            System.out.println("You have selected 35");
            order = "Ice Cream" +
                    "" +
                    "";
        }else{
            System.out.println("YOU HAVE SELECTED UNKNOWN NUMBER@!!");
            order = "Unknown";
        }


    }
}
