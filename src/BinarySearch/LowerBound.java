package BinarySearch;

import java.util.Scanner;

/**
 * The lower bound algorithm finds the first or the smallest index in a sorted array where the value at
 * that index is greater than or equal to a given key i.e. x.
 * The lower bound is the smallest index, ind, where arr[ind] >= x. But if any such index is not found,
 * the lower bound algorithm returns n i.e. size of the given array.
 */
public class LowerBound {

    public static int calculatebound(int[] arr,int x){
        int low = 0, high = arr.length-1;
        int ans = arr.length;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid-1;
            }else{
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
        System.out.println("Smallest Index : "+calculatebound(arr,x)+" & where element is grater than or equal to " + x);
    }
}
