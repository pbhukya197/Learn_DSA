package zorvyn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return null;
    }

    public static int[] findTwoSum(int[] arr, int target) { // when sorted
        if(arr == null || arr.length == 0){
            return new int[]{};
        }
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return new int[]{left+1,right+1}; // 1-based indexing
            }else if(sum > target){
                right--;
            }else {
                left++;
            }
        }
        return new int[]{};
    }



    public static void   main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] result = findTwoSum(arr,target);
        System.out.println(result);
        System.out.println(twoSum(arr,target));
    }
}
