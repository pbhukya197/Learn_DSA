package dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeElements {
    public int[] rearrangeElmentsSign(int[] arr){
        int[] nums = new int[arr.length];
        int pos = 0, nos = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0){
                nums[pos] = arr[i];
                pos += 2;
            }else{
                nums[nos] = arr[i];
                nos += 2;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        RearrangeElements obj = new RearrangeElements();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = obj.rearrangeElmentsSign(arr);
        System.out.println(Arrays.toString(res));
    }
}
