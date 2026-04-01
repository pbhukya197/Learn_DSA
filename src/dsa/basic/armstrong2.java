package dsa.basic;

import java.util.Scanner;

public class armstrong2 {
    public static int power(int base,int exponential){
        int result = 1;
        for(int i=0;i<exponential;i++){
            result = result * base;
        }
        return result;
    }
    public static int countdigits(int n){
        int digitcount = 0;
        while(n > 0){
            digitcount += 1;
            n = n / 10;
        }
        return digitcount;
    }
    public static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        int digits = countdigits(n);
        while(n > 0){
            int lastdigit = n % 10;
            sum += power(lastdigit,digits);
            n = n / 10;
        }
        return sum == original;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            if(isArmstrong(n)){
                System.out.println("ArmStrong Number");
            }else{
                System.out.println("Not a ArmStrong Number");
            }
        }
    }
}
