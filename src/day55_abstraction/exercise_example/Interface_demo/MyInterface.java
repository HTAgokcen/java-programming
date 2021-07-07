package day55_abstraction.exercise_example.Interface_demo;

public abstract class MyInterface {

    public abstract void learn();
}

interface MyInterface2 {

}

class MyClass extends MyInterface implements MyInterface2 {

    @Override
    public void learn() {
        System.out.println("Learning in MyClass");
    }
}

class Main {
    public static void main(String[] args) {
        //MyInterface myInterface = new MyInterface(); ERROR: cannot create object of interface
        MyClass myClass = new MyClass();

    }
}