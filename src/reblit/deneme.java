package reblit;
import java.util.*;
public class deneme {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        if( !email.contains("_")) {
            System.out.println(email);

        } else {
            //mike_tyson@gmail.com-->tyson_mike@gmail.com
            //firstName:
            //start from index 0, end right before _
            //lastName: start from index right after _ and right before @
            //indexOf(someStr)--> return location of that String
            //substring(startingIndex, endingIndex)
            //lastName + "_" + firstName + @gmail.com

            String firstName, lastName;
            int underscoreIndex, atSignIndex;
            underscoreIndex = email.indexOf("-");
            atSignIndex = email.indexOf("@");
            firstName = email.substring(0, underscoreIndex);
            lastName = email.substring(underscoreIndex+1, atSignIndex);
            System.out.println(lastName + "_" + firstName + "@gmail.com");
        }

    }
}
