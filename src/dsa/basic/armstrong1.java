package dsa.basic;

import java.util.Scanner;

public class armstrong1 {
    public static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        int digit = String.valueOf(n).length();
        while(n > 0){
            int lastdigit = n % 10;
            sum += (int) Math.pow(lastdigit,digit);
            n = n / 10;
        }
        return sum == original;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(isArmstrong(n)){
                System.out.println(n+" It is a ArmStrong Number");
            }else{
                System.out.println(n+" Not a ArmStrong Number");
            }
        }
    }
}
