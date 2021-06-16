package Array2_Solutions;

public class EvenOdd_2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, -3, 4, -34, 55, 78, 90, 33, 10};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i] % 2 == 0){
                even = nums[i];
                System.out.println("Even Number " + even);
            }else{
                odd = nums[i];
                System.out.println("Odd Number " + odd);
            }
        }


    }
}