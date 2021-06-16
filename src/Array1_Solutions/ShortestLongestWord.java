package Array1_Solutions;

import javafx.beans.binding.Bindings;

public class ShortestLongestWord {
    public static void main(String[] args) {
        String [] words = {"apple", "java", "apple tree", "candy", "programming", "dog"};
        String smallest = words[0];
        String longest = words[0];
        for(String eachWord : words){
            if(eachWord.length() < smallest.length()){
                smallest = eachWord;
            } if(eachWord.length() > longest.length()){
                longest = eachWord;
            }


        }
        System.out.println("Smallest word " + smallest);
        System.out.println("Longest word " + longest);
    }
}
