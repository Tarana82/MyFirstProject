package code15;

public class ReversingYourNameInterviewQuestion {
    public static void main(String[] args) {
        String name = "Tarana" ;

        System.out.println(name.charAt(0) +" " + name.charAt(1) + " " + name.charAt(2)
                                 + " " + name.charAt(3) + " " + name.charAt(4) + " " + name.charAt(5)   );


        System.out.println(name.charAt(5) +" " + name.charAt(4) + " " + name.charAt(3)
                + " " + name.charAt(2) + " " + name.charAt(1) + " " + name.charAt(0)  );

        // How do you find out last character of any String
        // counting character start with one
        // counting index (location ) start with 0
        // so last character index/location will be always one less than actual character count

        // Tarana has 6 character
        // 012345 and last character index is 5 NOT 6    6-1=5

        int characterCount = name.length();
        // counting character start with one
        // counting index (location ) start with 0
        // so last character index/location will be always one less than actual character count
        int lastCharIndex = characterCount - 1;
        char lastChar = name.charAt(lastCharIndex);

        System.out.println("LAST CHAR IS " + lastChar);

        System.out.println("last char in on shot " + name.charAt(  name.length() - 1) );

    }

}
