package dsa.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {
    public static int majorityElementOptimal(int[] arr,int n){
        int cnt = 0;
        int element = 0;
        for(int i=0;i<n;i++){
            if(cnt == 0){
                cnt = 1;
                element = arr[i];
            }else if(element == arr[i]){
                cnt++;
            }else{
                cnt--;
            }
        }
        int cnt1 = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == element){
                cnt1++;
            }
        }
        if(cnt1 > (n/2)){
            return element;
        }
        return -1;
    }
    public static int majorityElementBetter(int[] arr,int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> key : map.entrySet()){
            if(key.getValue() > (n/2)){
                return key.getKey();
            }
        }
        return -1;
    }
    public static int majorityElementBrute(int[] arr,int n){
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    cnt++;
                }
            }
            if(cnt > (n/2)){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElementBrute(arr,n));
        System.out.println(majorityElementBetter(arr,n));
        System.out.println(majorityElementOptimal(arr,n));
    }
}
