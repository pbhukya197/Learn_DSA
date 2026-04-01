package dsa.basic;

import java.util.Scanner;

public class printnames {
    public void getname(String str, int count, int n){
        if(count == n){
            return;
        }
        System.out.println(str);
        getname(str,count+1,n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        printnames obj = new printnames();
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            sc.nextLine();
            int n = sc.nextInt();
            obj.getname(str,0,n);
        }
    }
}
