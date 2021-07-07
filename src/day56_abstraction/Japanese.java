package day56_abstraction;

import java.sql.SQLOutput;

public class Japanese implements Greeting {
    @Override
    public void hi() {
        System.out.println("Merhaba");
    }

    @Override
    public void bye() {
        System.out.println("Hoscakal");

    }
}
