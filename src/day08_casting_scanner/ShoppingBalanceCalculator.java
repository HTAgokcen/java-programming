package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15.0;
        double remainingBalance = balance - (price1+price2+price3);
        //double remainingBalance = balance - price1 - price2 -price3;
        System.out.println("Your initial balance: $" + balance);
        System.out.println("Your remaining balance: $" + remainingBalance);
        //balance = remainingBalance;
        System.out.println("Your initial balance: $" + balance); // $219.68

        int balanceWithNoCents = (int)remainingBalance;
        System.out.println("Your remaing balance without cents : $" + balanceWithNoCents); //219


    }
}
