package reblit;
import java.util.*;
public class MethodNext_3_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int num = scan.nextInt();
        next3( num );

    }
    public static void next3(int num){
        System.out.println((num+1) + " "+ (num+2) + " "+ (num+3));
    }
}
