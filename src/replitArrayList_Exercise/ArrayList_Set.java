package replitArrayList_Exercise;

import java.util.ArrayList;

public class ArrayList_Set {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(4);
        nums.add(2);
        nums.add(8);
        nums.add(1);
        nums.add(-1);
        nums.set(2,99);// set -> it changes arrays nums place, moving other order
        nums.set(0,100);

        //Finish the code so the ArrayList will have 200 in index 1 and 50 in index 3
        nums.set(1,200);
        nums.set(3,50);
        System.out.println(nums);

    }
}
