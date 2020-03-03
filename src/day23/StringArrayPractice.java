package day23;

public class StringArrayPractice {
    public static void main(String[] args) {
        String[] shows = {"Orville", "Gifted", "Game of Throne" , "Flash" , "Arrow" , "Super girl"} ;

        String myFavoriteShow = shows[0] ;
        System.out.println("myFavorite show = " + myFavoriteShow);
        System.out.println("my favorite show character count is : " + myFavoriteShow.length() );

        System.out.println("myFavoriteShow =" + myFavoriteShow + " char count is :" + myFavoriteShow.length() );




        int showsCount = shows.length ;
        System.out.println("shows Count =" + showsCount);

        for (int x = 0; x < showsCount; x++) {

            String currentShow = shows[x] ;

            System.out.println( currentShow + "has character count : "
                                              + currentShow.length()  );
        }
    }
}
