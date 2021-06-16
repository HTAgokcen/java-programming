package ProblemSet_1PDF;

public class OfficeHoursSchedulePractise {
    public static void main(String[] args) {
        String day = "Friday";
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
                System.out.println("Office hours at 5:30 -6:45 EST");
            break;
            case "Thurday":
                System.out.println("Soft Skills day");
            break;
            case "Saturday":
            case "Sunday":
                System.out.println("Already a long day, no office hours.");
            default:
                System.out.println("Invalid day given");
            break;

        }
    }
}
