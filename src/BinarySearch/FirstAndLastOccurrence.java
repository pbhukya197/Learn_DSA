package BinarySearch;

import java.util.Scanner;

public class FirstAndLastOccurrence {

    public static int FirstOccurrence(int[] arr, int x){
        int low = 0;
        int high = arr.length - 1;
        int first = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == x){
                first = mid;
                high = mid - 1;
            }else if(arr[mid] < x){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return first;
    }

    public static int lastOccurrence(int[] arr, int x){
        int low = 0;
        int high = arr.length - 1;
        int last = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == x){
                last = mid;
                low = mid + 1;
            }else if(arr[mid] < x){
                low = mid + 1;
            }else  {
                high = mid - 1;
            }
        }
        return last;
    }

    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        int x = input.nextInt();
        System.out.println(FirstOccurrence(arr,x));
        System.out.println(lastOccurrence(arr,x));
    }
}
