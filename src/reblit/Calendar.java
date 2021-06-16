package reblit;
import java.util.Scanner;
public class Calendar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month number");
        int monthNums = scan.nextInt();

        switch(monthNums) {
            case 1:
                System.out.println("January");
            break;
            case 2:
                System.out.println("February");
            break;
            case 3:
                System.out.println("March");
            break;
            case 4:
                System.out.println("April");
            break;
            case 5:
                System.out.println("May");
            default:
                System.out.println("Invalid month number");
                break;

        }

    }
}
