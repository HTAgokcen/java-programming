package OfficeHourse.practise_03_29_2021;

public class MidChar {
    public static void main(String[] args) {
        /*
        Given a String, write a program to display the middle character of a string
a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.
Ex:
Input: elephant
Output: The middle characters: ph
  even = 4/2=2
         */

        String word = "apple";


        if(word.length() % 2 == 1) {
            //odd
            System.out.println(word.charAt(word.length()/2));
            System.out.println(word.substring(word.length()/2, word.length()/2 +1));

        } else {
            //even = en
        }





    }

}
