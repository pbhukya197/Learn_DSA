package dsa.arrays;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static int maxConsecutiveOnes(int[] arr){
        int cnt = 0;
        int maxcnt = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] == 1){
                cnt++;
            }else{
                cnt =0;
            }
            maxcnt = Math.max(cnt,maxcnt);
        }
        return maxcnt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxConsecutiveOnes(arr));
    }
}
