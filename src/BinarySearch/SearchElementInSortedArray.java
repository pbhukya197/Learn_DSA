package BinarySearch;

import java.util.Scanner;

public class SearchElementInSortedArray {
    public static int searchElement(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                return mid;
            }
            // Left Half Sorted
            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target < arr[mid]){
                    high = mid - 1;
                }else {
                    low = mid + 1;
                }
            }
            // Right Half Sorted
            else {
                if(arr[mid] < target && target <= arr[high]){
                    low = mid + 1;
                }else  {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(searchElement(arr, target));
    }
}
/**
 * Time Complexity - O(nlogn)
 * Space Complexity - O(1)
 */