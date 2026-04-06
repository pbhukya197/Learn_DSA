package BinarySearch;

import java.util.Scanner;

/**
 * The upper bound algorithm finds the first or the smallest index in a sorted array where the
 * value at that index is greater than the given key i.e. x.
 * The upper bound is the smallest index, ind, where arr[ind] > x.
 */
public class UpperBound {

    public static int calculateUpper(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        int ans =arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] > x){
                ans = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(calculateUpper(arr,x));
    }
}
