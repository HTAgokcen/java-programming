package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        /*
id        - o
firstName - 1
lastName  - 2
batchNum  - 3
phoneNum  - 4

Declare student array and store 5 String values

String[] student1 = {"1234", "Adam"...};

String[] student2 = new String[5];
         */

        String [] student1 = new String[5];
        student1[0] = "Ad1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "202-543-1234";

        String [] student2 = {"MK4421" , "Mike" , "Bloomberg" , "B22" , "703-432-1234" };
        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 first name = " + student1[1]);
        System.out.println("student1 lastName = " + student1[2]);
        System.out.println("student1 batch name = " + student1[3]);
        System.out.println("student1 mobile num = " + student1[4]);

        System.out.println("student data length: " + student1.length);

        // check if student1 data array contains 5 items.
        //true: PASS: data array has correct length
        //false: FAIL: data array has incorrect length
        if (student1.length == 5) {
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println("FAIL: data array has incorrect length");
        }


        /*
        check if student1 and student2 arrays have some number of of data.
        TRUE: PASS: data arrays length match
        FALSE: FAIL: data arrays length mismatch
         */
        if (student1.length == student2.length) {
            System.out.println("PASS: data arrays length match");
        } else {
            System.out.println("FAIL: data arrays length mismatch");
        }
        /**
         * read from array and print firsname and last name in all uppercase
         */
        System.out.println(student1[1].toUpperCase()+ " " + student1[2].toUpperCase());


    }
}
