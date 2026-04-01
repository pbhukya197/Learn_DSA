package dsa.arrays;

import java.util.Scanner;

public class MaximumSubArraySumKadens {
    public static int maxiumumSubArraySum(int[] nums){
        long max = Long.MIN_VALUE;
//        long max = 0;  when an empty Subarray is present use "0"
        long sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return (int) max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(maxiumumSubArraySum(nums));
    }
}
