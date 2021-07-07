package OfficeHours._06_22_2021;

public class Target extends Shopping {
    /*
    Create a concrete class Target
- Inherit Shopping and implement all abstract methods
     */

    @Override
    public void buyItem() {
        System.out.println("Buying item from Target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Target");
    }
}

