package day26;

public class ReviewArray {
    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10};
//                        0 1 2 3 4
        numbers [3]=numbers[1]+numbers[2];
        System.out.println(numbers[3]);
        int [] numbersNew={numbers[4],numbers[1],numbers[2],numbers[3],numbers[0]};
        numbers=numbersNew;
       // System.out.println(Arrays.toString(numbers));
    }
}


