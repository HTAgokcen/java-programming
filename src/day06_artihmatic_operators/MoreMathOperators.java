package day06_artihmatic_operators;

public class MoreMathOperators {
    public static void main(String[] args) {
        /*toyotas - 431
        hondas - 233
        vw - 2
        tesla - 20
        nissan - 1
        bmws - 155

        totalCarsInParking -> should equal all of those.

        OUTPUT:
        There are 842 cars in parking lot

         */
        int toyatas = 431;
        int hondas = 233;
        int vw = 2;
        int tesla = 20;
        int nissan = 1;
        int bmws = 155;
        // int toyotas = 431, hondas = 233, vw = 2, teslas = 20, nissan = 1, bmws = 155;

        int totalCarsInParking = toyatas + hondas + vw + tesla + nissan + bmws;
        System.out.println("There are " + totalCarsInParking + " cars in parking lot");


        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices /  people;
        //there are 2 slices per person
        System.out.println("There are " + slicesPerPerson + " slices per person" );
        //We ordered hawaiian pizza with 8 slices, 4 people ate 2 slices each.
        System.out.println("We ordered " + pizza + " pizza with " + slices + " slices " + people +
                " people ate " + slicesPerPerson + " slices each ");

    }
}
