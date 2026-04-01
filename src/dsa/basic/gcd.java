package dsa.basic;

import java.util.Scanner;

public class gcd {
    public static int gcdoftwonumbers(int n1,int n2){
        while(n1 > 0 && n2 > 0){
            if(n1 > n2){
                n1 = n1 % n2;
            }else{
                n2 = n2 % n1;
            }
        }
        if(n1 == 0){
            return n2;
        }
        return n1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int gcd = gcdoftwonumbers(n1,n2);
            System.out.println("The GCD of "+n1+" and "+n2+" is : "+gcd);
        }
    }
}
