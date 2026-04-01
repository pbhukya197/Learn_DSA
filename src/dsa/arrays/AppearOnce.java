package dsa.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class AppearOnce {
    public static int apperOnceUsingXor(int[] arr){
        int xor = 0;
        for(int i=0;i<arr.length;i++){
            xor ^= arr[i];
        }
        return xor; // Optimal
    }
    public static int apperOnceUsingHasmap(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : arr) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        for(int key : hm.keySet()){
            if(hm.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
    public static int apperOnce(int[] arr){
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int cnt = 0;
            for(int j=0;j< arr.length;j++){
                if(arr[j] == num){
                    cnt++;
                }
            }
            if(cnt == 1) {
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(apperOnce(arr));
        System.out.println(apperOnceUsingHasmap(arr));
        System.out.println(apperOnceUsingXor(arr));
    }
}
