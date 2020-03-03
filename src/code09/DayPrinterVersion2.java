package code09;

public class DayPrinterVersion2 {

    public static void main(String[] args) {

        int dayCode = 6;
        String dayName = ""; // assigning a empty String value

        if(dayCode == 1) {
            dayName ="Monday" ;
        }else if (dayCode == 2) {
            dayName ="Tuesday" ;
        }else if (dayCode == 3) {
            dayName ="Wednesday" ;
        }else if (dayCode == 4) {
            dayName ="Thursday" ;
        }else if (dayCode == 5) {
            dayName ="Friday" ;
        }else if (dayCode == 6) {
            dayName ="Saturday" ;
        }else if (dayCode == 7) {
            dayName ="Sunday" ;
        }else {
            dayName = "Unknown" ;
          //  System.out.println("Day is Unknown");
        }
            System.out.println("Day is " +dayName );
    }
}
