package ProblemSet_1PDF;

public class CharacterChecker {
    public static void main(String[] args) {
        // use asci table
        char letter = 'V' ;
        if (letter >= 65 && letter <= 90){
            System.out.println(letter + " is a uppercase letter");
        } else if (letter >= 97 && letter <= 127) {
            System.out.println(letter + " is lowercase letter");
        } else {
            System.out.println(letter + " is not valid letter");
        }
    }
}
