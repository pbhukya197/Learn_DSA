package dsa.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sort012 {
    public static List<Integer> sort(int[] arr){
        List<Integer> ls = new ArrayList<>();
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for(int x : arr){
            ls.add(x);
        }
        return ls;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sort(arr));
    }
}
