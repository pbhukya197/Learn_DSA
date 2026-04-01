package dsa.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrayzeo {
    public static int longestSubArrayWithZero(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum == 0){
                max = i+1;
            }
            else{
                if(hm.containsKey(sum)){
                    max = Math.max(max,i-hm.get(sum));
                }else {
                    hm.put(sum,i);
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(longestSubArrayWithZero(arr));
    }
}
