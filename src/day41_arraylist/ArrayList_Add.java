package day41_arraylist;

import java.util.ArrayList;

public class ArrayList_Add {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("app");
        words.add("downtown");
        words.add("raining");


        words.add(0, "hey");
        words.add(3, "yo");





        System.out.println(words);

    }
}
