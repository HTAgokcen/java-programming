package day_09_scanner_practise;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("####### MILES TO KM CONVERTER");
        System.out.println("Enter miles:");
        double miles = scan.nextDouble();
        double kilometres = miles * 1.609;
        System.out.println(miles + " miles in kilometres: " + kilometres);
    }
}