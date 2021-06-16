package OfficeHourse_4_27_2021;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
       fib(8);

        }
        public static void fib(int num){
        int [] arr= new int [num+1];// 9 numbers in an array if num = 8
        arr[0] = 0;//dont need this line since array is zeros since no values specific
        arr[1] = 1;

        for (int i = 2; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
            System.out.println(Arrays.toString(arr));
        }
    }

