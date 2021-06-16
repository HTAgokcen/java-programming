package WalterSawitch_Arrays;
import java.util.*;
public class BasicExamples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

        int[] myArr = new int[nums.length * 2];
        for(int i = 0; i <nums.length * 2; i++){
            if(i == myArr.length - 1){
                myArr[myArr.length - 1] = nums[nums.length - 1];
                System.out.println(myArr[2]);
            } else{
                myArr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(myArr));
    }
}


