package day57_abstraction_polymorhism.polymorhism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTests {
    public static void main(String[] args) {
        Animal a1 = new Animal(); //not polymorphic, data type and object type same
        a1.makeNoise();
        //Polymorhism - polymorphic way:
        //parent type = new child type
        Animal animal1 = new Dog();
        Animal animal2 = new Horse();
        Animal cat = new Cat();
       // List list = new ArrayList();
        animal1.makeNoise();
        animal2.makeNoise();
        cat.makeNoise();
        //Polymorhic list of objects.list data type is Parent class
        //objects are any of child class
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Horse());
        listOfAnimals.add(new Cat());



    }
}
