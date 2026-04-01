package dsa.sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void bubblesort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            boolean didswap = false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didswap = true;
                }
            }
            if(!didswap){
                break;              // Time Complexity - O(n) - Best case
            }
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        bubblesort(arr,n);
    }
}
