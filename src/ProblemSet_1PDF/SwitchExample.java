package ProblemSet_1PDF;

public class SwitchExample {
    public static void main(String[] args) {
        String houseType = "Villa";
        int maxOccupants = 8;

        switch (houseType) {
            case "Tree house":
            maxOccupants = 1;
                System.out.println("Max Occupants for a " + houseType + "is " +maxOccupants + " occupants");
                break;
            case "Mobile home":
            maxOccupants = 2;
                System.out.println("Max Occupants for a " + houseType + "is " +maxOccupants + " occupants");
            break;
            case "Villa":
            maxOccupants = 8;
                System.out.println("Max Occupants for a " + houseType + "is " +maxOccupants + " occupants");
                break;
            default:
                System.out.println("invalid Entry");
            break;
        }
    }
}
