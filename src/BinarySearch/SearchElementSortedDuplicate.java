package BinarySearch;

import java.util.Scanner;

public class SearchElementSortedDuplicate {
    public static boolean searchElementDuplicate(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return true;
            }
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low++;
                high--;
                continue;
            }
            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target < arr[mid]){
                    high = mid -1;
                }else  {
                    low = mid + 1;
                }
            }else {
                if(arr[mid] < target && target <= arr[high]){
                    low = mid +1;
                }else  {
                    high = mid -1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int target = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(searchElementDuplicate(arr,target));
    }
}
