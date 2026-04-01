package dsa.basic;

import java.util.Scanner;

public class countDigits {
    public static int countdigits(int n){
        int count = 0;
        while(n > 0){
            count += 1;
            n = n/10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int digits = countdigits(n);
            System.out.println("The Number of Digits in n : "+digits);
        }
    }
}
