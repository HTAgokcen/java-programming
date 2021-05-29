package day48_consructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObject {

    public static void main(String[] args){
        Customer cs1 = new Customer();
        System.out.println(cs1.toString()); // print with default value that are set in no=arg consructor
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("mike", 2);//create object and assign value in same statement
        Customer cs3 = new Customer("John", 23);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of customer  // index 0      1    2     3
        Customer[] todaysCustomers = {cs1, cs2, cs3, new Customer("Bashir", 449)};

        //arraylist of Customer objects
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Bashir", 449));
        customerList.add(new Customer("Suleyman", 9763));

        //print info of first customer object in array and arraylist
        System.out.println(todaysCustomers[0]);// print first customer in array
        System.out.println(todaysCustomers[0].toString());


        System.out.println(customerList);//print to string() info all customer objects

        for(int i = 0; i < customerList.size(); i++){
            System.out.println(customerList.get(i));
        }

        System.out.println("------FOR EACH LOOP--------");
        for(Customer eachCustomer : customerList) {
            System.out.println(eachCustomer);
        }

        //print all names of Customer in the list
        System.out.println("-----NAMES OF CUSTOMER------");
        customerList.forEach(each -> System.out.println(each.getName()));//lambda expression
        for(Customer eachCustomer : customerList){
            System.out.println(eachCustomer.getName());
        }



    }



}
