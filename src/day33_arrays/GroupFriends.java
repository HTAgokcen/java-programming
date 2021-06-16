package day33_arrays;

public class GroupFriends {
    public static void main(String[] args) {
        /*
        declare String array called friends
and assign all first names of your group friends

Loop through the names in friends array
and print
    Happy Holidays Nancy!
    Happy Holidays Daud!
         */

                 //            0       1         2        3       4          5          6         7
        String[] friends = {"Saim", "Nadir", "Gurkan", "Akbar", "Mike", "Marufion", "Muhtar", "Asiya"};

        for(String eachFriend : friends){
            System.out.println("Happy holidays " + eachFriend + "!");
        }

    }
}
