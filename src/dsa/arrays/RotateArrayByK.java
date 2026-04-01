package dsa.arrays;

import java.util.Scanner;

public class RotateArrayByK {
    public static void rotateRight(int[] arr,int k){
        int n = arr.length;
        k = k % n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;  // Time complexity - O(n)  && Space Complexity - O(1)
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotateRight(arr,k);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
