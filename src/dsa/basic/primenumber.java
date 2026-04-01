package dsa.basic;

import java.util.Scanner;

public class primenumber {
    public static boolean isprime(int n){
        if(n <= 1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
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
            if(isprime(n)){
                System.out.println(n+" : is a Prime Number");
            }else{
                System.out.println(n+" : is not a Prime Number");
            }
        }
    }
}
