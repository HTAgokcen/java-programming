package Office.Hours.Practise_03_03_2021;

public class Array_Even_Odd_Number {
    public static void main(String[] args) {
        /*
        Task:
         */
      int [] nums = {4,1,3,12,5};
      int even = 0;
      int odd = 0;
      for(int eachNum : nums){
          if(eachNum % 2 == 0){ //check odd: eachNum %2 != 0 or eachNum %2 ==0
              even++;
          } else {
              odd++;
          }
      }
        System.out.println(" Even : " + even);
        System.out.println("Odd : " + odd);
    }
}
