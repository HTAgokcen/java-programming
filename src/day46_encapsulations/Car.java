package day46_encapsulations;

public class Car {
    //encapsulated/hidden instance variables

    private String model;
    private int year;
    private int mileage;

    //setter method for model
    public void setModel(String carModel){
        model = carModel;
    }
    //getter method for model
    public String getModel(){
        return model;
    }

    //setter for year
    public void setYear(int year){
        this.year = year;

    }
    //getter for year
    public int  getYear(){
        return year;

    }
    //getter setter for mileage
    //generate toString
    public int getMileage(){
        // return this.mileage;
        return mileage;
    }
    //myCar.setMileage(45230)
    public void setMileage(int mileage){
        this.mileage = mileage;

    }
  //we generate string using short cut
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}

