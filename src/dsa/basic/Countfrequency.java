package dsa.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Countfrequency {
    public void countfrequencies(int n,int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> map : hm.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Countfrequency obj = new Countfrequency();
        obj.countfrequencies(n,arr);
    }
}
