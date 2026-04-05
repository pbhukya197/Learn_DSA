package zorvyn;

import java.util.Scanner;

public class MaxSumSubarrayK {

    /**
     * Sliding Window is a technique used to efficiently process subarrays or substrings by maintaining
     * a “window” (a range of elements) and moving it step-by-step instead of recalculating everything again.
     * Time Complexity - O(n)
     * Space Complexity - O(1)
     */
    public static int maxSumSubarrayK(int[] arr, int k) {
        if(arr == null || arr.length == 0 || k < 0 || k > arr.length){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int windowSum = 0;
        // First Window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        max = windowSum;
        // Slide Window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k]; // add next element and remove previous element
            max = Math.max(max, windowSum);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println("Maximum Sum Subarray of size K :" + maxSumSubarrayK(arr, k));
    }
}
