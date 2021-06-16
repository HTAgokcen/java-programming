package Array1_Solutions;

public class MAxMinNumber {
    public static void main(String[] args) {
       /*
       // int [] arr = {3,1,500,-3,-10,4,3};
       // int min = arr[0];
        int max = arr[0];
        for(int each : arr){
        //each -> every element | for loop: arr[i]
        if(each < min){
            min = each;

        }
        if(each > max){
            max = each;
        }
        }
        System.out.println("Min: " + min);
      //  System.out.println("Max: " + max);

        */

        System.out.println("-----------------------------------------------------------");
        int[] arr = {2,4,7,13,-9,34,23};
        int min1 = arr[0];
        int max1 = arr[0];
        for(int i = 0; i < arr.length; i++){
            //each ->every element | for loop arr[i]
            if(arr[i] < min1){
                min1 = arr[i];

            }
            if (arr[i] > max1) {
                max1 = arr[i];
            }
            }
        System.out.println("MIN: " + min1);
        System.out.println("MAX: " + max1);

        }
    }

