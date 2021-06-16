package Array1_Solutions;

public class EvenOddNumber {
    public static void main(String[] args) {
        int[] nums = {4, 2, 6, 9, 13, 57, 89};
        int even = 0;
        int odd = 0;
        for (int eachNum : nums) {
            if (eachNum % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}