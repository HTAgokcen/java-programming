package OfficeHours;
import java.util.Scanner;
public class practiseRectange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your length");
        double length = input.nextDouble();
        System.out.println("Enter your width");
        double width = input.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;



    }
}
