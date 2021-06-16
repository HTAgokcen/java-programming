package replitArrayList_Exercise;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist_Size_Get {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter num");
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < size; i++){
            list.add(in.nextInt());
        }
     int sum = 0;
        for(int i = 0; i < size; i++){
            sum += list.get(i);
        }
        System.out.println(sum);

    }
}
