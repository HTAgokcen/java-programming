package day_18_conditions_practise_strings_intro;

public class FizzBuzz {
    public static void main(String[] args) {

        int number = 15;
        if(number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");

        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("Crazy number");
        }
    }
}