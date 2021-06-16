package StringPractisePDF;
import java.util.Scanner;
public class Practise_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String word = scan.nextLine();
        if(word.length()%2 ==0) {
           System.out.println(word.charAt(word.length()/2));
            //System.out.println(word.substring(word.length()/2, word.length()/2+1));
        } else {
            int index = word.length()/2;
            //System.out.println(word.charAt(index -1) + ""+word.charAt(index));
            System.out.println(word.substring(index -1, index +1));
        }


    }
}
