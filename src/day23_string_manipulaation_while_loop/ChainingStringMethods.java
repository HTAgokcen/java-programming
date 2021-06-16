package day23_string_manipulaation_while_loop;

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "woo den sp oon";
        System.out.println(word.toUpperCase().toLowerCase().length());

        //remove spaces first then print everything uppercase
        System.out.println(word.replace(" ","").toUpperCase()); //replace delete all space in this string

        String city = "ISTANBUL";
        System.out.println(city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase());//Istanbul
         String capitalized = city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();
        System.out.println("capatilized = " + capitalized);//capatilized = Istanbul
        //.isEmpty().toUpperCase() Does not work since isEmpty is boolean




    }


}
