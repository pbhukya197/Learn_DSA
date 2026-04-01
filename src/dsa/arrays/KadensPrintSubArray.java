package dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KadensPrintSubArray {
    public static void kadensPrintSubArray(int[] arr){
        long maxSum = arr[0];
        long currentSum = arr[0];
        int start =0, end = 0, tempStart = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > currentSum+arr[i]){
                currentSum = arr[i];
                tempStart = i;
            }else{
                currentSum += arr[i];
            }
            if(currentSum > maxSum){
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }
        System.out.println("The Max SubArray is : ");
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nmaxsum : "+maxSum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        kadensPrintSubArray(arr);
    }
}
