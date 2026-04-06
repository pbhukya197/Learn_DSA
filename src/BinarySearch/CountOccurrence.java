package BinarySearch;

import java.util.Scanner;

public class CountOccurrence {
    public static int findFirst(int[] arr,int x){
        int low = 0;
        int high = arr.length - 1;
        int start = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == x){
                start = mid;
                high = mid - 1;
            }else if(arr[mid] < x){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return start;
    }
    public static int findLast(int[] arr,int x){
        int low = 0;
        int high = arr.length - 1;
        int last = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == x){
                last = mid;
                low = mid + 1;
            } else if(arr[mid] < x) {
                low = mid + 1;
            }else  {
                high = mid - 1;
            }
        }
        return last;
    }
    public static int count(int[] arr,int x){
        int first = findFirst(arr,x);
        if(first == -1){
            return 0;
        }
        int last = findLast(arr,x);
        return last - first + 1;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[]  arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(count(arr,x));
    }
}
