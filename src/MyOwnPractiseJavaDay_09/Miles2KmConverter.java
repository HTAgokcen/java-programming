package MyOwnPractiseJavaDay_09;
import java.util.Scanner;
public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("######### MILES TO KM CONVERTER #########");
        System.out.println("Please Enter Miles : ");
        //double miles = 10.0
        double miles = scan.nextDouble();
        double kilometers = miles * 1.609;
        System.out.println(miles + " miles in kilometers " + kilometers);
    }
}
