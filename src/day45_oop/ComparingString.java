package day45_oop;

public class ComparingString {
    public static void main(String[] args) {
        String word1 = "java";//in string pool
        String word2 = "java";//re=use from string pool
        String word3 = new String("java");//create in HEAP,outside String pool
        String word4 = new String("java");

        System.out.println(word1 == word2);//true- POINT TO SAME OBJECT IN POOL
        System.out.println(word1 == word3);//false - POINT TO DIFFERENT OBJECT IN HEAP AND POOL
        System.out.println(word3 == word4);//false - POINT TO DIFFERENT OBJECT IN HEAP

        System.out.println(word1.equals(word2));//.equalls always compare values//TRUE
        System.out.println(word1.equals(word3));//TRUE - COMPARING VALUES
        System.out.println(word3.equals(word4));//TRUE - COMPARING VALUES

    }
}
