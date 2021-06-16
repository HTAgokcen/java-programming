package day13_conditional_statetements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("****** WELCOME COME TO TD BANK");

        int secretPinCode = 2233;
        int inputPinCode = 2283;
        if (secretPinCode == inputPinCode) {
            System.out.println("Welcome to your account");
            System.out.println("You can withdraw, check your balace, deposit");
        } else {
            System.out.println("Incorrect pincode ! " + inputPinCode);
            System.out.println("Please try again !");

        }
        System.out.println("Thank you for using TD Bank ATM!");
    }
}
