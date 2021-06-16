package day_14_multi_Branch_if_statements;

public class YesOrNo {
    public static void main(String[] args) {
        /*
        print "Are you sure you want to delete this file?"
selection > "y";
answer -> boolean variable

selection -- "y"
    true :
        "your file will be deleted"
        answer -> true
    false :
        "file deletion cancelled"
        answer -> false


"Did file get deleted? - true"
         */
        System.out.println("Are you sure you want to delete this file?");

        char selection = 'n';
        boolean answer;
        String result;
        if (selection == 'y') {
            System.out.println("Your fill be deleted");
            answer = true;
            result = "deleted";
        } else {
                System.out.println("File deletion cancelled");
                answer = false;
                result = "not deleted";
            }
        System.out.println("Did file get deleted? - " + answer);//it is not related if statement
        }
    }

