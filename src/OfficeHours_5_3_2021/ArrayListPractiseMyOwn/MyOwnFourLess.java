package OfficeHours_5_3_2021.ArrayListPractiseMyOwn;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOwnFourLess {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "cat", "tree", "loop", "animal", "shortcut"));
        ArrayList<String> list2 = new ArrayList<>();

        for(String each : list){
            if(each.length() <= 4){
                list2.add(each);
            }
        }

        System.out.println(list2);
    }
}
