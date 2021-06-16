package Array1_Solutions;

public class Ouestion_1 {
    public static void main(String[] args) {

        //100 number array
        int [] number = new int[100];

        for (int i = 0; i < number.length; i++){
            number[i] = (i + 1);
        }
        for(int each : number){
            System.out.println(each);
        }

    }
}
