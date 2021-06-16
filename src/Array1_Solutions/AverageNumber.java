package Array1_Solutions;

public class AverageNumber {
    public static void main(String[] args) {
        int [] num = {4,5,6,7,8,10,80,70};
        int sum = 0;
        for(int each : num){
            sum += each;
        }
        System.out.println(sum/num.length);
    }
}
