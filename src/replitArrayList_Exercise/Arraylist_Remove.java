package replitArrayList_Exercise;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        // Write your code below


        list.remove(0);
        list.remove(0);



        // Do not touch below
        System.out.println(list);

    }
}
