package OfficeHours.Practise_03_02_2021;

public class PersonInfo {
    public static void main(String[] args) {
        // Variables without any data

        String name, fullBirthDate, favoriteQuote;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasons, year;
        double birthDate;

        // Assignment of data
        name = "Saim";
        age = 50;
        gender = 'M';
        student = true;
        numberOfSiblings = 5;
        favoriteNumber = 3L;
        numberOfSeasons = 4;
        birthDate = 3.2;
        year = 2021;
        fullBirthDate = "" + birthDate + year; //
        //fullBirthDate = birthDate + year + "" ; //2024.2-> adds first then turns to String favoriteQuate = "have a good mindset"

System.out.println("Full birthdate: " + fullBirthDate);
System.out.println("Age: " +age);



    }
}
