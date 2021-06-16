package MyOwnPractiseDay_10;

public class ChangeVariableValue {
    public static void main(String[] args) {

        double rent = 500.00;
        rent = rent + 100;
        System.out.println("rent: " + rent);// -> rent 600

        double fuelPrice = 2.75;
        fuelPrice = fuelPrice -1;
        System.out.println("fuelPrice = " + fuelPrice);// -> 1.75


        int pizzaSlices = 8;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices / 2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        //get another pizza for me
        pizzaSlices = pizzaSlices + 6;
        System.out.println("pizzaSlices = " + pizzaSlices);

        int players = 10;
        System.out.println("players: " + players);
        //double the players to start match
        players = players * 2;
        System.out.println("players: " + players);

        int cents = 9586;
        System.out.println("cents = " + cents);
        //keep the whole dollars portion and just assign remaining cents
        cents = cents % 100;
        System.out.println("Remaining cents = " + cents);
    }
}
