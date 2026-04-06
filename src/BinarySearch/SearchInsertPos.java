package BinarySearch;

import java.util.Scanner;

public class SearchInsertPos {

    public static int calculateSearchInsertPosition(int[] arr, int x) {
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int x = input.nextInt();
        System.out.println("Index at : "+calculateSearchInsertPosition(arr,x));
    }
}
