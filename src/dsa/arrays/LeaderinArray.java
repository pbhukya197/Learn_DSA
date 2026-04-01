package dsa.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeaderinArray {

    public static ArrayList<Integer> findLeaders(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr.get(i) > max){
                list.add(arr.get(i));
                max = Math.max(max, arr.get(i));
            }
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> result = findLeaders(arr,n);
        for(int num : result){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
