package day45_oop;

public class Coffee {
    @Override
    public String toString() {
        return "Coffee{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }

    /**
     * can be 0=1000 as a percentage
     */
    int amount;
    String type;
    public void refill() {
        amount = 100;
    }

    public void drink(int someAmount) {
        amount -= someAmount;
    }

    public int getAmount() {
        return amount;
    }

    public void setType(String newType) {
        type = newType;
    }

    public String getType() {
        return type;
    }
}
