package day_18_conditions_practise_strings_intro;

public class MultiBranchIf {
    public static void main(String[] args) {
        int number = 3;
        if (number > 0) {
            System.out.println(number + " is positive");
        }
        else if (number<0) {
            System.out.println(number + " is negative");
        } else { //else if (number == 0)
            System.out.println(number + " is zero");

        }
    }
}
