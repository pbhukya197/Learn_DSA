package dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosEnd {
    public static int[] moveZeroesToEnd(int[] arr){
        int idx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(moveZeroesToEnd(arr)));
    }
}
