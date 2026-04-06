package BinarySearch;

import java.util.Scanner;

/**
 * Floor of x is the largest element in the array which is smaller than or equal to x
 * Ceiling of x is the smallest element in the array greater than or equal to x
 */
public class FloorAndCeil {

    public static int calculateFloor(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low <= high){
            int mid = (low+high)/2;
            if(arr[mid] <= x){
                ans = arr[mid];
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return ans;
    }

    public static int calculateCeil(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low <= high){
            int mid = (low+high)/2;
            if(arr[mid] >= x){
                ans = arr[mid];
                high = mid-1;
            }else  {
                low = mid+1;
            }
        }
        return ans;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int x  = sc.nextInt();
        int ans = calculateFloor(arr,x);
        System.out.println(ans);
        int res = calculateCeil(arr,x);
        System.out.println(res);
    }
}
