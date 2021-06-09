package day50_inheritanceSecond;

public class Person {
    /*
    * Sub class
    * Parent Class

     */
    String name;
    int age;


    public void walk(){
        System.out.println("Person is walking");
    }
    public void talk(){
        System.out.println(name + " is talking");
    }
    public void work (String job){
        System.out.println();
    }
}
