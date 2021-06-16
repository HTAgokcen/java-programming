package day43_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithLIstReturn {
    public static void main(String[] args) {
        System.out.println(System.nanoTime());
        List<Integer> mlnNums = getIntegerList();//returns ready ArrayList object. no need new Arra..
        System.out.println(mlnNums);

    }
    /**
     * getIntegerList
     * No params
     * return List<Integer>
     *    Loop from 0 - 1000_000
     *    and add to arraylist then return it
     */
    public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i <= 1_000_000; i++) {
            nums.add(i);
        }
        return nums;
    }

    /**
     * getIntegerArray
     * No params
     * return int[]
     *    Loop from 0 - 1000_000
     *    and add to int[] then return it
     */

    public static int[] getIntegerArray() {
        //declare empty array with size - 1_000_001
        int[] nums = new int[1_000_001];
        //loop and assign numbers
        for(int i = 0; i <= 1_000_000; i++) {
            nums[i] = i;
        }
        return nums; //return
    }

}

