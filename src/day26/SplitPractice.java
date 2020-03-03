package day26;

public class SplitPractice {
    public static void main(String[] args) {
        // 2 additional String methods related to array
        //toCharArray() , another is split(bySomething)

        String survey = "Complete B15 Online 1 Month Survey" ;

        char[] surveyChars = survey.toCharArray();
        for ( char each : surveyChars ) {
            System.out.println("each char is : " + each);
        }
    // just for fun why we try while loop
       int x = 0 ;
        while ( x < surveyChars.length ){
            System.out.println("each char is : " + surveyChars[x] );
        }
    }

}
