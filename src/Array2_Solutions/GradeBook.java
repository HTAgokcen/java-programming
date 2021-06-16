package Array2_Solutions;

public class GradeBook {
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90,75,80};
        char [] grades = new char[names.length];
        for( int i = 0; i < scores.length; i++){
            int eachScore = scores[i];
            if(eachScore >= 85) {
                grades[i] = 'A';
            }else if(eachScore >= 'B'){
                grades[i] = 'B';
            }else {
                grades[i] = 'C';
            }

        }
        System.out.println("GRADEBOOK");
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i] + " | "+ scores[i] + " | " + grades[i]);
        }
    }
}
