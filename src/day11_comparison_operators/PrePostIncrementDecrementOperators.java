package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        // PRE-INCREMENT ++(increase by 1)
        int num1 = 10;
        int num2 = ++num1;

        System.out.println("num1 = " + num1);//11
        System.out.println("num2 = " + num2);//11

        //POST-INCREMENT -> add1 afterwards
        int num3 = 8;
        int num4 = num3;
        num3++; //add1

        System.out.println("num3 = " + num3); //9
        System.out.println("num4 = " + num4); //8

        int apples = 5;
        int basket = ++apples;
        System.out.println("apples = " + apples);//6
        System.out.println("basket = " +basket);//6

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);//16
        System.out.println("kiwiBasket = " + kiwiBasket);//15

        int cars = 5;
        System.out.println(++cars);//6

        int sedans = 10;
        System.out.println(sedans++);//10
        System.out.println(sedans);//11

        int myNumber = 44;
        myNumber++;
        System.out.println(myNumber);//45
        ++myNumber;
        System.out.println(myNumber);//46

        myNumber = 20;
        System.out.println(++myNumber);//21

        myNumber = 33;
        System.out.println(myNumber++);//33
        System.out.println(myNumber);//34

       int a = 50;
       int b = 22;
       int c = a++ + ++b;
        System.out.println("a = " + a);//51
        System.out.println("b = " + b);//23
        System.out.println("c = " + c);//73



    }
}
