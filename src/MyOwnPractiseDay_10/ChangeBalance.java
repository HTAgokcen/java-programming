package MyOwnPractiseDay_10;

public class ChangeBalance {
    public static void main(String[] args) {
   double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava : " + baklava);
        //decrease balance by baklava price
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);// 1208.05

        double dolma = 44.25;
        System.out.println("dolma =" + dolma);
        balance = balance - dolma;
        System.out.println("balance after dolma = " + balance);//1163.8

        //second dolma is 50% off. lets buy it
        dolma = dolma / 2;
        System.out.println("dolma = " + dolma); //22.125
        //but it decrease balance with dolma price
        balance = balance - dolma;
        System.out.println("balance after dolma = " + balance);//1141.675




    }


    }
