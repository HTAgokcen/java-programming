package day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0));//j
        System.out.println(word.charAt(1));//a
        System.out.println(word.charAt(2));//v
        System.out.println(word.charAt(3));//a

        System.out.println(word.length());//4

        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt(0));//first letter: C
         char first = company.charAt(0);
        System.out.println(first); // C
        char second = company.charAt(1);
        System.out.println(second);//y
        char third = company.charAt(3);
        System.out.println(third);
        char fourth = company.charAt(4);
        System.out.println(fourth);
        char fifth = company.charAt(5);
        System.out.println(fifth);
        char sixth = company.charAt(6);
        System.out.println(sixth);
        char seven = company.charAt(7);
        System.out.println(seven);
        //print everything same line with space C y b e r t e k
        System.out.println(first + " " + second + " " + third + " " + fourth + " " + fifth + " " + sixth + " " + seven );

        String withSpaces = first + " " + second + " " + third + " " + fourth + " " + fifth + " " + sixth + " " + seven ;
        System.out.println("withSpcaces " + withSpaces);

    }
}
