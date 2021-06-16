package day_18_conditions_practise_strings_intro;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
        int month = 4;
        if (month == 12 || month == 11 || month == 1) {
            System.out.println("Winter");
        }






        switch (month) {
            case 3: case 4: case 5 :
                System.out.println("spring");
        }





    }
}
