package dsa.basic;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // number of terms

        int a = 0;
        int b = 1;

        for(int i = 1; i <= n; i++){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}