package reblit;
import java.util.*;
public class Methods_PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number, Please");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);

    }

    public static void isPalindrome(int num){
        int reverse = 0;
        int temp = num;
        while(temp != 0){
            int lastDigit = temp % 10;
            reverse = (reverse*10) + lastDigit;
            temp /= 10;
        }
        System.out.println(reverse == num);
    }
}
