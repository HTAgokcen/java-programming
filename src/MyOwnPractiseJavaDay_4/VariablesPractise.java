package MyOwnPractiseJavaDay_4;

public class VariablesPractise {
    public static void main(String[] args) {
        //declare variable students that stores numbers
        int students;
        students = 50;
        System.out.println(students);//50
        students = 70;
        System.out.println(students); //70

        students = 111;
        students = 125;//cannot declare same variable 2 times. But we can change its value.
        System.out.println(students);//125

        int teachers;
        teachers = 2;
        int mentors;
        mentors = 25;
        System.out.print("Number of teachers: ");
        System.out.println(teachers);
        System.out.print("Number of mentors: ");
        System.out.println(mentors);



    }
}
