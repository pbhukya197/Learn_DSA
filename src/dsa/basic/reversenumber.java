package dsa.basic;

import java.util.Scanner;

public class reversenumber {
    public int reverseNumber(int n){
        int reversenumber = 0;
        while(n > 0){
            int lastdigit = n % 10;
            reversenumber = reversenumber * 10 + lastdigit;
            n = n / 10;
        }
        return reversenumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reversenumber obj = new reversenumber(); //Object Creation for a non static method
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(obj.reverseNumber(n));  //Object method calls
        }
    }
}


