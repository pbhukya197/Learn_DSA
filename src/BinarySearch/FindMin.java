package BinarySearch;

import java.util.Scanner;

public class FindMin {
    public static int calculateMinimum(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            int mid = low + (high - low)/2;
            if(arr[mid] > arr[high]){
                low = mid + 1;
            }else {
                high = mid;
            }
        }
        return arr[low];
    }
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[]  arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(calculateMinimum(arr));
    }
}
