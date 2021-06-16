package day_14_multi_Branch_if_statements;

public class LogicalAndOperator {
    public static void main(String[] args) {
        System.out.println(true && true);// true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false

        System.out.println(10 > 5 && 1 == 1);//true. true + true = true
        System.out.println(10 > 5 && 1 == 3);//false. true + false = false
        System.out.println(3 < 2 && 5 > 2);//false. false + true = false
        System.out.println(10 > 15 && 5 > 10);//false. false + false = false

        int apples = 10, oranges = 5;
        boolean check = apples > 5 && oranges > 3;
        System.out.println("check = " + check);// true
        if (apples > 6 && oranges > 2) {
            System.out.println("I have enough fruits.");
        } else {
            System.out.println("I need to go to Walmart to buy some fruits.");

        }
    }
}
