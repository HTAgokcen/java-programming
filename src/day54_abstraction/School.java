package day54_abstraction;

public class School {
    public static void main(String[] args) {
       // Student student = new Student(); //ERRoR. cannot create object of student
        //student.attendClass();ERROR
        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.attendClass();


        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();


    }
}
