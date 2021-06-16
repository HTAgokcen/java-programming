package MyOwnPractiseJavaDay_5;

public class UsingVariables {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = num1;
        System.out.println(num1);//100
        System.out.println(num2);//100

        num1 = 200;// print yapmadan once her seferinde variable ayri tanimlanmak gerekir

        num2 = num1;
        System.out.println(num1);//200
        System.out.println(num2);//200

        int n1 = 55;
        int n2 = n1;
        int n3 = n2;
        /*
        n1-> 55
        n2-> 55
        n3 ->55
         */
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n2);

        int inthirasZipCode = 22182;
        int parvinsZipCode = inthirasZipCode;
        System.out.println(inthirasZipCode);
        System.out.println(parvinsZipCode);

        inthirasZipCode = 20007;
        System.out.println(inthirasZipCode);//20007  changed
        System.out.println(parvinsZipCode);// 22182 still same no change



    }
}
