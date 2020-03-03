package code22;
public class ReverseOrder {
    public static void main(String[] args) {


    int[] scores = new int[4];
    // assigning value to each index
    //assigning value to each index
    scores[0] = 95;
    scores[1] = 70;
    scores[2] = 88;
    scores[3] = 100;
    int itemCount = scores.length;      //4
    int lastItemIndex = itemCount - 1;  //3
    // we are printing in reverse order so
    // so we start with highest index till lowest index 0  -->> 3-0
        for (int x = lastItemIndex; x>= 0; x--){
        System.out.println( "index location" + x);
        System.out.println(scores [x]);
    }
}










        }
