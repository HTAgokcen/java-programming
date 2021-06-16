package MyOwnPractiseDay_10;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars); //10
        cars = cars + 2;
        System.out.println("cars in parking lot = " + cars); //12
        cars += 5;
        System.out.println("cars in parking lot = " + cars); //17

        //6 cars left the parking  lot
        //cars =-6;
        //System.out.println("cars in parking lot = " + cars);//-6
        cars -= 6;
        System.out.println("cars in parking lot = " + cars);//11

        String world = "java";
        System.out.println("world = " + world);
        world = world + "programming";
        System.out.println("world = " + world);
        //add is fun
        world += " is fun ";
        System.out.println("world = " + world);

        String selenium = " but \"selenium\" is more fun ";
        world += selenium;
        System.out.println("world = " + world);

        world += 12345; // add 12345 to world
        System.out.println("world = " + world);

        char letter = 'A';
        System.out.println("letter = " + letter);//A
        letter += 3;
        System.out.println("letter = " + letter);//D
        letter += 1;
        System.out.println("letter = " + letter);//E




    }
}
