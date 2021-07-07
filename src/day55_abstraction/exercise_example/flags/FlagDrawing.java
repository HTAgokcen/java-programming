package day55_abstraction.exercise_example.flags;

import java.awt.*;

public class FlagDrawing {

        public static void main(String[] args) {
            RussianFlag russianFlag = new RussianFlag();
            russianFlag.draw();

            FrenchFlag france =new FrenchFlag();
            france.draw();


            UkranianFlag ukraine = new UkranianFlag();
            ukraine.draw();
        }
}
