package dsa.arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutive {

    /**
     *Brute force
     * Time Complexity - O(n^2)
     * Space complexity - O(n)
     */
    public static int longestConsecutive(int[] arr, int t) {
        int longest = 0;
        for(int i=0;i<t;i++){
            int currNum = arr[i];
            int count = 1;
            while (isLongestConsecutive(arr,currNum+1)){
                currNum = currNum+1;
                count += 1;
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
    public static boolean isLongestConsecutive(int[] arr, int k) {
        for(int num : arr){
            if(num == k){
                return true;
            }
        }
        return false;
    }

    /**
     * Optimal approach
     * Time Complexity - O(n)
     * Space Complexity - O(n)
     */
    public static int longestConsecutiveOptimal(int[] arr, int t) {
        if(t == 0){
            return 0;
        }
        int longest = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        for(int it : set){
            if(!set.contains(it-1)){
                int count = 1;
                int number =  it;
                while (set.contains(number+1)){
                    number = number+1;
                    count += 1;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr =  new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Longest Consecutive in array: "+longestConsecutive(arr,t));
        System.out.println("The Longest Consecutive in array: "+longestConsecutiveOptimal(arr,t));
    }

}
