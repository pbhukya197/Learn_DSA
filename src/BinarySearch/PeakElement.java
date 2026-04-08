package BinarySearch;

import java.util.Scanner;

public class PeakElement {
    public int findPeak(int[] arr){
        int n = arr.length;
        if(n == 1){
            return 0;
        }
        if(arr[0] > arr[1]){
            return 0;
        }
        if(arr[n-1] >  arr[n-2]){
            return n-1;
        }
        int low = 1, high = n-2;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] > arr[mid-1] &&  arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(arr[mid] > arr[mid-1]){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public int findPeakO(int[] arr){
        int n = arr.length;
        int low = 0, high = n-1;
        while(low < high){
            int mid = (low + high)/2;
            if(arr[mid] > arr[mid+1]){
                high = mid;
            }else {
                low = mid+1;
            }
        }
        return low;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        PeakElement peak = new PeakElement();
        int sol = peak.findPeak(arr);
        int ans = peak.findPeakO(arr);
        System.out.println("Index found at: "+sol);
        System.out.println("Index found at: "+ans);
    }
}
