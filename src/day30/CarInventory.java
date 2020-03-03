package day30;

public class CarInventory {
    public static void main(String[] args) {
        String [] cars = {
                "Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"};
        int chevCounter = 0,
                civicCounter = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].contains("Chevrolet")) {
                chevCounter++;
            } else if (cars[i].contains("Civic")) {
                civicCounter++;
            }
        }
        System.out.println("Chevrolet: " +chevCounter);
        System.out.println("Civic: " +civicCounter);
    }
}

                   /* "Acura-NSX",
                    "Chevrolet-Corvette",
                    "Chevrolet-Cavalier",
                    "BMW-3 Series",
                    "Pontiac-LeMans",
                    "BMW-7 Series",
                    "Oldsmobile-Achieva",
                    "Honda-Civic"*/
            //  Create a class called CarInventory with main
            // count how many Chevrolet is in this array
            // and how many civic you have

