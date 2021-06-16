package day16_switch_ternary;

public class CappucinoBuyer {
    public static void main(String[] args) {
        /*
        declare
price    ->
calories ->
size could be "tall", "grade" ,"venti"

when size = "tall"
    print "Tall Cappuccino please"
    price    ->  3.69
    calories ->  90
//use break
when size = "grade"
    print "Grande Cappuccino please"
    price    ->  3.99
    calories ->  120

when size = "Venti"
    print "Venti Cappuccino please"
    price    ->  4.29
    calories ->  150

any other size:
    print "We don't serve that size of Cappuccino"


print "Total price: $3.69"
      "You will consume 90 cal of energy"
         */
        String size = "tall";
        double price = 0.0;
        int calories = 0;

        if (size.equals("tall")) {

        }
        switch (size) {
            case "tall":
                System.out.println("Tall Cappuccino please");
                price = 3.69;
                calories = 90;
                break;
            case "grande":
                System.out.println("Grande Cappuccino please");
                price= 3.99;
                calories = 120;
                break;
            case "Venti":
                System.out.println("Venti Cappuccino please");
                price = 4.29;
                calories = 159;
            default:
                System.out.println("We don't serve that size of Cappuccino");

        }
        System.out.println(("total price: $ " + price));
        System.out.println("Total calories: " + calories);
    }
}