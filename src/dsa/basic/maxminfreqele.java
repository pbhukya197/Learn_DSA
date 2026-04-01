package dsa.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maxminfreqele {
    public static int[] frequency(int n,int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : arr){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int maxfrequency = Integer.MIN_VALUE;
        int minfrequency = Integer.MAX_VALUE;

        int maxelement = Integer.MAX_VALUE;
        int minelement = Integer.MAX_VALUE;

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            int element = entry.getKey();
            int frequency1 = entry.getValue();

            if(frequency1 > maxfrequency || (frequency1 == maxfrequency && element < maxelement)){
                maxfrequency = frequency1;
                maxelement = element;
            }
            if(frequency1 < minfrequency || (frequency1 == minfrequency && element < minelement)){
                minfrequency = frequency1;
                minelement = element;
            }
        }
        return new int[]{maxelement,minelement};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(frequency(n, arr)));
        }
    }
}
