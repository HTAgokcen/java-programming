package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "MOM";
        char first = word.charAt(0);
        char last = word.charAt(2);

        if (first == last) {
            System.out.println("first and last letters match");
        } else {
            System.out.println("first and last letters mismatch");


        }
    }
}