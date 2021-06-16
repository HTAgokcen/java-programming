package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
     //declare arraylist
        ArrayList<String> cities = new ArrayList<>();
        //add cities to arraylist ->add methods
        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");
        //add Ashgabat to array list
        cities.add(0, "Ashgabat");
        //print all values in same line
        System.out.println(cities);
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city =" + cities.get(5));
        //find last index using size()-1
        System.out.println("last city = " +cities.get(cities.size()-1));
        int size= cities.size();
        System.out.println("there are " + size + " cities in the list");


        //for loop and print all values in same line
        for(int i = 0; i < cities.size()/2; i++){
            System.out.print(cities.get(i)+ " ");
        }
        System.out.println();

        for(String city : cities){
            System.out.print(city + " ");
        }
        System.out.println();
        //delete item from arraylist
        //1) remove using index(remove Vienna. delete value at index 3
        cities.remove(3);

        //2)remove using object/value
        cities.remove("New York");

        System.out.println("after remove " + cities);

        //delete/remove all values from list
        cities.clear();

        //make sure it is clear
        //1-) print it out
        System.out.println("cities = " + cities);

    }
}
