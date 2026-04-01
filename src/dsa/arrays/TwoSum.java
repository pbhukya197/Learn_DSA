package dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSumOptimal(int[] arr,int target){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return new int[]{left,right};
                // return new int[]{left+1,right+1}  --> 1-Based indexing
            }else if(sum > target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{-1,-1};  //  Only for sorted arrays
    }
    public static int[] twoSumBrute(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] res1 = twoSumBrute(arr,target);
        int[] res2 = twoSumOptimal(arr,target);
        System.out.println(Arrays.toString(res1));
        System.out.println(Arrays.toString(res2));
    }
}
