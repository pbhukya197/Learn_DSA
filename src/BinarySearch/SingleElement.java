package BinarySearch;

import java.util.Scanner;

public class SingleElement {
    public int findSingleEle(int[] arr){
        int n =  arr.length;
        if(n == 1){
            return arr[0];
        }
        if(arr[0] != arr[1]){
            return arr[0];
        }
        if(arr[n-1] != arr[n-2]){
            return arr[n-1];
        }
        int low = 1, high = n-2;
        while(low <= high){
            int mid = low + (high-low) / 2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }
            // left half
            if((mid % 2 == 1 && arr[mid] == arr[mid-1]) || (mid % 2 == 0 && arr[mid] == arr[mid+1])){
                low = mid + 1;
            }else  { // right half
                high = mid - 1;
            }
        }
        return -1;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SingleElement se = new SingleElement();
        int result = se.findSingleEle(arr);
        System.out.println("The Single Element in an array: " + result);
    }
}
