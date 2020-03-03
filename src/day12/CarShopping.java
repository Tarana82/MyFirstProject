package day12;

public class CarShopping {
    public static void main(String[] args) {

        //buy Corolla or Tesla (only if it's within the budget)

        //there is only one car covered with cloth
        //we dont know what car is it and what is the price
        //once we take out the cloth
        //we check whether its toyota, if it's we buy it without checking the price
        //if it's not we check if its a Toyota and also check whether it is within the budget

        String carBrand = "Toyota Highlander";
        int carPrice =25000;
        int budget = 30000;

        if(carBrand.equals("Toyota Higlander") || carBrand.equals("Honda") && carPrice <= budget ) {

            System.out.println("CAR AQUIRED !!!");

        }else{
            System.out.println("NOT WHAT I AM LOOKING FOR");

        }

    }
}
