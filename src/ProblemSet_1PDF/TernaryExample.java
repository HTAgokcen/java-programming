package ProblemSet_1PDF;

public class TernaryExample {
    public static void main(String[] args) {
        int time = 16;
        String morningOrNight = (time >= 0 && (time <= 11)) ? "Morning" : "Night";
        System.out.println((time >= 0 && (time <= 11)) ? "Morning" : "Night");
    }
}
