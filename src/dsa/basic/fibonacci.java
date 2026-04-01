package dsa.basic;

import java.util.Scanner;

public class fibonacci {
    public static int getfibonacci(int n){
        if(n<=1){
            return n;
        }
        return getfibonacci(n-1)+getfibonacci(n-2);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            System.out.println("Fibonacci Series : "+getfibonacci(n));
        }
    }
}
