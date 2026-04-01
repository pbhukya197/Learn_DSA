package dsa.basic;

import java.util.Scanner;

public class prime {
    public static boolean isprime(int n){
        if(n <= 1){
            return false;
        }
        if(n <= 3){
            return true;
        }
        if(n % 2 == 0 || n % 3 == 0){
            return false;
        }
        for(int i=5;i*i<=n;i=i+6){
            if(n % i == 0 || n % (i+2) == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if (isprime(n)){
                System.out.println(n+" : is a prime number");
            }else{
                System.out.println(n+" : not a prime number");
            }
        }
    }
}
