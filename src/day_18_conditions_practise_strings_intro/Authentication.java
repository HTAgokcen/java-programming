package day_18_conditions_practise_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int expLast4SSN = 1234;
        int expPinCode = 4321;

        int last4SSN = 1234;
        int PinCode = 1111;

        if (last4SSN == expLast4SSN && PinCode == expPinCode) {
            System.out.println("Authentication succesful");
        } else {
            System.out.println("Authentication unsuccessful");
            if (last4SSN != expLast4SSN) {
                System.out.println("Last 4 SSN number is incorrect");
            }
            if (expPinCode != PinCode) {
                System.out.println("Pin code is incorrect");
            }

        }
    }
}
