package day27_loops;

public class Neigbors {
    public static void main(String[] args) {



                      //1234567891011
        String word = "jaavvaa spoonn";
        for(int index = 0; index < word.length()-1; index++) {
            System.out.print(word.charAt(index));
            System.out.println(word.charAt(index+1));
          if (word.charAt(index) == word.charAt(index+1)) {
              System.out.println("beep - " + word.charAt(index));
          }
        }
    }
}
