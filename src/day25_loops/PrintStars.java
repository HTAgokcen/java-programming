package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for(int starts = 1; starts <= 15; starts++){
            System.out.print("* ");
        }
        System.out.println();//start new line
        String myStarts = "";
        // for loop: fill 5 starts to myStarts variable
        for(int starts = 1; starts <= 5; starts++){
           // myStarts = myStarts +"* ";
            myStarts += "* ";
        }

        System.out.println("my starts = " + myStarts.trim());//*****
    }
}
