package dsa.arrays;

import java.util.Scanner;

public class LongestSubArrayWithSumK {
    public static int longestSubArrayBrute(int[] nums, int k){
        int n = nums.length;
        int mxlength = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum = 0;
                for(int c=i;c<=j;c++){
                    sum += nums[c];
                }
                if(sum == k){
                    mxlength = Math.max(mxlength,j-i+1);
                }
            }
        }
        return mxlength;  // Brute force
    }
    public static int longestSubArray(int[] nums, int k){
        int left = 0;
        int maxLength = 0;
        int sum = 0;
        for(int right = 0;right < nums.length; right++){
            sum += nums[right];
            while(sum > k){
                sum -= nums[left];
                left++;
            }
            if(sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }
        return maxLength; // Only for positive integers
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println("Longest SubArray with sum k : "+longestSubArray(nums,k));
        System.out.println("Longest SubArray with sum k : "+longestSubArrayBrute(nums,k));
    }
}
