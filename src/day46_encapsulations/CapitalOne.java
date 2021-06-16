package day46_encapsulations;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(34569704334L);
        acc.setBalance(250.50);
        acc.setAccountHolder("Mike Smith");
        acc.setType("360 Checking");
        System.out.println("acc = " + acc);

    }
}
