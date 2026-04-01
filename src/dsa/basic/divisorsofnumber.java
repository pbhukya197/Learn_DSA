package dsa.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class divisorsofnumber {
    public List<Integer> getdivisors(int n){
        List<Integer> res = new ArrayList<>();
        for(int i=1;i*i <= n;i++){
            if(n % i == 0){
                res.add(i);
            }
            if(i != n / i){
                res.add(n / i);
            }
        }
        return res;
    }
    public static void main(String[] args){
        divisorsofnumber obj = new divisorsofnumber();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            List<Integer> lst = obj.getdivisors(n);
            System.out.println("Divisiors of a Number : ");
            for(int val : lst){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
