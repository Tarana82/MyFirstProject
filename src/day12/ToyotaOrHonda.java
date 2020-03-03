package day12;

public class ToyotaOrHonda {
    public static void main(String[] args) {

        String carBrand = "Toyota";
    int carPrice =25000 ;
    int budget = 30000;

    // if(carBrand.equals("Toyota Higlander") || carBrand.equals("Honda") && carPrice <= budget ) {

    //   System.out.println("CAR AQUIRED !!!");

    //  }else{
    //    System.out.println("NOT WHAT I AM LOOKING FOR");
    // }

    if( carBrand.equals("Toyota") ) {
        System.out.println("CAR AQUIRED !!!");
    }else if (carBrand.equals("Honda")&& carPrice <=budget ) {

        System.out.println("Honda CAR AQUIRED !!!");
    }else{
        System.out.println("NOT WHAT I AM LOOKING FOR");

    }



    }

}


