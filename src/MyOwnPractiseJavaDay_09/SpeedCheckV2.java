package MyOwnPractiseJavaDay_09;
import java.util.Scanner;
public class SpeedCheckV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter current speed");
        int currentSpeed = scan.nextInt();
        int speedLimit = 55;
        int overLimit = currentSpeed - speedLimit;
        System.out.println("You are driving " + overLimit + " mph over the limit. Slow Down");
    }
}
