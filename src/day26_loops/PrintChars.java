package day26_loops;

public class PrintChars {
    public static void main(String[] args) {

        String word = "java";
        //System.out.println(word.length());
       // System.out.println(word.charAt(0));
       // System.out.println(word.charAt(1));
       // System.out.println(word.charAt(2));
       // System.out.println(word.charAt(3));
        //System.out.println(word.charAt(5));
       // long way without loop
        //*

       for(int i = 0; i < word.length(); i++) {
           System.out.println(word.charAt(i));
       }

    }
}
