package dsa.basic;

import java.util.Scanner;

public class palindromenumber {
    public boolean ispalindrome(int n){
        int reversenumber = 0;
        int temp = n;
        while(n > 0){
            int lastdigit = n % 10;
            reversenumber = reversenumber * 10 + lastdigit;
            n = n / 10;
        }
        return temp == reversenumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        palindromenumber obj = new palindromenumber();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(obj.ispalindrome(n)){
                System.out.println("Palindrome Number");
            }else{
                System.out.println("Not a Palindrome Number");
            }
        }
    }
}
