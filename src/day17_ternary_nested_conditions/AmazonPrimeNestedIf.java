package day17_ternary_nested_conditions;

public class AmazonPrimeNestedIf {
    public static void main(String[] args) {
        double price = 15;
        boolean isPrimeMember = false;
        if (isPrimeMember) {
            System.out.println("Prime Free 2 day shipping eligible");

        } else {
            if (price>=25.0) {
                System.out.println(" Eligable free shipping" );
            } else {
                System.out.println("Not eligable for free. Fee = $10");
            }
        }






    }

}
