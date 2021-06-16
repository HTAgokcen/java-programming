package day15_logicalops_switch_ternary;

public class AndOperatorPractise {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Wooden Spoon";
        //if (onSale == freeShipping == true)
        if (onSale && freeShipping) {
            System.out.println("Adding to cart - " + itemName);
        } else {
            System.out.println("Continue shopping for good deals on-" + itemName);
        }
        //add to cart only when it is freeShipping, onSale and item name is Wooden Spoon.

        if (freeShipping && onSale && itemName.equals("Wooden spoon")) {
            System.out.println("Add to cart - " + itemName);

        } else {
            System.out.println("Continue shopping for good deals on- " + itemName);
        }
        //location, salary, remote, benefits
    }

}
