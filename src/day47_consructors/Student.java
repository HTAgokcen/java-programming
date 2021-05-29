package day47_consructors;

public class Student {
    private String name;
    private int age;
    //No_args constructor
    public Student(){
        System.out.println("no-Args constructor");

    }
    //constructor overloading with 1 param: String name
    public Student(String name){
        System.out.println("name param constructor | name = " + name);


    }
    //constructor with age
    public Student (int age){
        System.out.println("age param consructor | age = " + age);

    }
    //consructor with name and age
    public Student (String name, int age){
        System.out.println("name&age param consructor | + ");
    }

}
