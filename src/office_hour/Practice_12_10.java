package office_hour;

public class Practice_12_10 {
    public static void main(String[] args) {
        String[] cars = {"bmw", "wv","audi"};
                          //0     1    2
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        for(int carsIndex = 0; carsIndex <= 2; carsIndex++){
            System.out.println("Here is your car " + cars[0]);
        }

        //for each loop

        //temporary variable  : array name

        for(String carModel :    cars  ){
            System.out.println("i am done assigning the car " + carModel);
        }



    }

}
