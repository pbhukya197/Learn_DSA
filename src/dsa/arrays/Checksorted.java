package dsa.arrays;

import java.util.ArrayList;
import java.util.Scanner;

// Check if an array is sorted
public class Checksorted {
    public static ArrayList<Integer> checkSorted(int[] arr){
        ArrayList<Integer> ls = new ArrayList<>();
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i] < arr[i-1]){
                return ls;
            }
        }
        for(int x : arr){
            ls.add(x);
        }
        return ls;
    }
    public static boolean sorted(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static boolean sortedarray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sortedarray(arr));
        System.out.println(sorted(arr));
        System.out.println(checkSorted(arr));
    }
}

