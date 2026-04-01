package dsa.basic;

import java.util.Scanner;

public class Countfreq {
    public static int[] frequency(int n,int x,int[] nums){
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int value = nums[i];
            if(value <= n){
                arr[value-1]++;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int[] result = frequency(n,x,nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
