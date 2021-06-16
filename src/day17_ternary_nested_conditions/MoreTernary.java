package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("reply " + reply);

        String todaysClass = "java";
        String teacher = (todaysClass.equals("java")) ? "Saim|Murodil" : "Nadir;";
        System.out.println("Today's teacher = " + teacher);

        boolean isEligableToDrive = true;
        // String driving = // "have DL, Can drive"     "No DL, cannot drive"
        String driving = isEligableToDrive ? "yes have DL, Can drive" : "No DL, cannot drive";
        System.out.println("Driving " + driving);


    }
}
