package reblit;
import java.util.Scanner;
public class Weekdays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int day = scan.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");

            default:
                System.out.println("Not a valid day");
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wendesday");
                break;
            case 4:
                System.out.println("Thurday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");







        }

    }
}
