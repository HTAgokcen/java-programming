package OfficeHours_05_19_2021;

public class Birds {

    //encapsulation
     private String species;
    private boolean canFly;
    private double beakLength;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean CanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly; //this ->represent which object has been used
    }

    public double getBeakLength() {
        return beakLength;
    }

    public void setBeakLength(double beakLength) {
        this.beakLength = beakLength;
    }
}
