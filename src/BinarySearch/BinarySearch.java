package BinarySearch;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearchmethod(int[] arr, int low, int high, int target){
        if(low > high){
            return -1;
        }
        int mid = (low + high)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(target > arr[mid]){
            return binarySearchmethod(arr,mid+1,high,target);
        }
        return binarySearchmethod(arr,low,mid-1,target);
    }

    public static int binarySearchRecursive(int[] arr, int target){
        return binarySearchmethod(arr,0,arr.length-1,target);
    }

    public static int binarySearchIterative(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
        /**
         *
         */
    }

    /**
     * Binary Search always be a sorted array
     * given a sorted array of integers and a target, your task is to search for the target in the given
     * array. Assume the given array does not contain any duplicate numbers.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println("Iterative approach: "+binarySearchIterative(arr,target));
        System.out.println("Recursive approach: "+binarySearchRecursive(arr,target));
    }
}
