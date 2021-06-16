package MyOwnPractiseDay_10;
import java.util.Scanner;
public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rent and month: ");
        double rent = scan.nextDouble();
        scan.nextLine();//fix the bug. WORKAROUND
        String month = scan.next();

        System.out.println("rent = " + rent);
        System.out.println("month = " + month);

    }
}
