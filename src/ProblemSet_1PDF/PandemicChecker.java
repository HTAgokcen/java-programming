package ProblemSet_1PDF;

public class PandemicChecker {
    public static void main(String[] args) {
        int year = 2021;
        if (year >= 1346 && year <= 1353) {
            System.out.println("The Black Death");
        } else if (year >= 1770 && year <= 1772) {
            System.out.println("Great Plague of London");
        } else if (year >=1889 && year <= 1890) {
            System.out.println("Flu pandemic");
        } else if (year <= 2021 && year>= 2019) {
            System.out.println("COVID -19");
        } else {
            System.out.println("Invalid year");
        }
    }
}
