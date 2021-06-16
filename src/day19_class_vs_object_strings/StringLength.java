package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count " + word.length()) ;
        System.out.println("wooden spoon".length());
        String firstName = "Nadir";
        System.out.println(firstName + "-" + firstName.length());
       // System.out.println("Nadir".length());//only how many number in this word

        int count = firstName.length();
        System.out.println("count = " + count);

        String password = "abc123";
        /*IF STATEMENT :
        WHEN password is at least 6 characters:
        print : valid amazon password
        else
        print : password too short

        */
        if (password.length() >= 6) {
            System.out.println("valid amazon password");
        } else {
            System.out.println("password too short");
        }



    }
}
