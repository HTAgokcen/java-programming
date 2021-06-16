package day_09_scanner_practise;
import java.util.Scanner;
public class TempConventar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" ###### F TO C CONVERTER PROGRAM ######");
        System.out.println("Enter Fahrenheit value:");
        double fahrenheitValue = input.nextDouble();
        double celsiusValue =(fahrenheitValue - 32) * 5/9;
        System.out.println(celsiusValue + " F is in C:" + celsiusValue);
    }
}
