package day_18_conditions_practise_strings_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int score = 120;
        if (score>=1 && score<=40) {
            System.out.println("Grade D");
        } else if (score >=41 && score<=60) {
            System.out.println("Grade C");
        } else if (score>= 61 && score<= 90) {
            System.out.println("Grade B");
        } else if (score >= 91 && score <= 100) {

            System.out.println("Grade A");
        } else if(score <= 0 || score > 100) {
            System.out.println("Invalid score = " + score);
        }
        }
        }


