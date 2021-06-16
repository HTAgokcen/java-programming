package ProblemSet_1PDF;
import java.util.Scanner;
public class Question_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people do you live in?");

        int liveWith = scan.nextInt();
        if (liveWith <= 2) {
            System.out.println("Live with less than 2 people.");
        } else if (liveWith >=3 && liveWith <= 6) {
            System.out.println("Live with 3-6 people");
        } else {
            System.out.println("live with more than 6 people");
        }

        System.out.println("What city do you live in");
        String city = scan.nextLine();
        System.out.println("Do you live in downtown");
        String downtown = scan.next();
        if (downtown.equals("yes")) {
            System.out.println("Have you thought about moving to suburbs?");
            String suburbs = scan.next();
        if (suburbs.equals("yes")) {
                System.out.println("Do it its great!");
            } else {
                System.out.println("You should think about it.");
            }
        }
        System.out.println("What is your favorite animal");
        String animal = scan.nextLine();
        System.out.println("Wow " + animal + " great animal");
        System.out.println("How many pets are you want");
        int pets = scan.nextInt();
        System.out.println("Interesting, do you want " + pets + animal + " animals");


    }
}
