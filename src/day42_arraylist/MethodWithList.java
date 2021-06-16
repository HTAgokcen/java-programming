package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodWithList {
    public static void main(String[] args) {
        //declare array list and add values
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium"); words.add("a"); words.add("input"); words.add("title");
        //pass the words list to printStrList method
        printStrList(words);

        printStrList(Arrays.asList("select", "option", "br", "python", "sql", "api"));
    }
    /**
     * methodName: printStrList
     * param: List of Strings
     * return: void
     * print all values separated by space in same line
     */
    public static void printStrList(List<String> stringList) { //"java", "apple", "coffee", "tea"
        for(String str : stringList){
            System.out.println(str + " ");
        }
        System.out.println();
        /**
         * method: sumIntegerList
         * param: List of integers
         * return int
         * calculates sum of integers in the list then returns
         */


    }
}
