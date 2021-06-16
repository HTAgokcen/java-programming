package reblit;

public class FindingDublicate {
    public static void main(String[] args) {
        int [] nums = {1,1,2,3,4,3,4};
        //which number is noduplicate:


        int count = 0;
        for(int each : nums){
            if(each == nums[0]) {
            count++;
            }
        }
        System.out.println(count);
    }

}
