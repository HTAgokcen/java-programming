package GroupStudyNotes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Method_REview_05_07_2021 {
    public static void main(String[] args) {

        /**
         * Java is object oriented language, everything except primitives are objects in java programming.
         *
         * For that reason, there is a way to convert a primitive to an object using WRAPPER CLASSES.
         *
         * primitive -> just single piece of data, and no behaviour.
         * Object -> can have multiple data, and behaviour.
         *
         * Auto-boxing is converting from primitive to wrapper class object.
         * Un-boxing is converting from wrapper class object to a primitive.
         *
         */

        // look always the left side of equation:
        Integer i = new Integer(345);

//----------------------------------------------------------------------------------------------------------//
        /**
         *  ArrayList work as simple array but the size is changeable
         *  Array works with objects and primitives
         *  ArrayList just works with objects
         */
        // How to declare an ArrayList:

        ArrayList<String> myArray = new ArrayList<>(); // the capacity is ten but the size is zero
        ArrayList<Integer> myArray1 = new ArrayList<>(100); // the capacity is 100 but the size is zero
        System.out.println("Size of myArray1 is : " + myArray1.size());

        ArrayList<Double> myArray2 = new ArrayList<Double>();
        //ArrayList<> myArray2 = new ArrayList<Double>(); it means we need to add data type on the left side

        // how to add values into ArrayList directly:
        List<Integer> myArray3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        List<Integer> myArray4 = new ArrayList<>();
        myArray4 = Arrays.asList(5, 6, 7, 8);

        myArray4 = Arrays.asList(3, 4, 5);

        System.out.println(myArray4); // we re assign the ArrayList

        // but it does not work in this way:
        //       List<Integer> myArray4 = new ArrayList<>();
        //       myArray4 = Arrays.asList(5, 6 ,7 ,8);

        List<Integer> myArray5 = new ArrayList<>();
        myArray5.addAll(Arrays.asList(7, 8, 9, 10));

        myArray3.addAll(myArray5); // add all value from another Array to new array.

        System.out.println("myArray5 = " + myArray5);

        //----------------------------------------------------------------------------------------------------------//
        // Methods in ArrayList:
        // .add()


        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("nums = " + nums); // one of benefits of ArrayList == allow to print directly

        // two different method for adding :
        nums.add(3); // this is boolean methods: it means return boolean value and add number
        System.out.println(nums.add(3));
        // it will add value to the last index automatically
        System.out.println("nums after add 3 = " + nums);

        //
        nums.add(2, 4); // add element into the specific index
        System.out.println("nums = " + nums);

        //System.out.println(nums.add(3, 5)); you can not print it since this is void method !!!

        //----------------------------------------------------------------------------------------------------------//
        //  .get() ==> to read value of specific index of your ArrayList
        System.out.println(nums.get(4));

        //----------------------------------------------------------------------------------------------------------//
        //  remove(index) ==> to remove value at the given index: // return the value of that index and then remove it

        nums.remove(2);
        System.out.println("nums = " + nums);
        System.out.println(nums.remove(3)); // return the value
        System.out.println("nums = " + nums); // also remove it

        // remove(value) ==>

        nums.remove("2"); // return boolean
        System.out.println(nums.remove("2")); // false== since we dont have "2"

        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "kiwi"));
    }
}
