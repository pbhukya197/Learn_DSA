package dsa.arrays;

import java.util.*;

public class Unionoftwoarrays {
    public static List<Integer> unionUsingTwoPointer(int[] arr1,int[] arr2){
        int i=0,j=0;
        List<Integer> sol = new ArrayList<>();
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                if(sol.isEmpty() || sol.get((sol.size()-1)) != arr1[i]){
                    sol.add(arr1[i]);
                }
                i++;
            }else {
                if(sol.isEmpty() ||sol.get(sol.size()-1) != arr2[j]){
                    sol.add(arr2[j]);
                }
                j++;
            }
            while (i < arr1.length){
                if(sol.isEmpty() || sol.get((sol.size()-1)) != arr1[i]){
                    sol.add(arr1[i]);
                }
                i++;
            }
            while(j < arr2.length){
                if(sol.isEmpty() ||sol.get(sol.size()-1) != arr2[j]){
                    sol.add(arr2[j]);
                }
                j++;
            }
        }
        return sol;
    }
    public static List<Integer> unionUsingMap(int[] arr1,int[] arr2){
        Map<Integer,Integer> mp = new TreeMap<>();
        for(int num1 : arr1){
            mp.put(num1,mp.getOrDefault(num1,0)+1);
        }
        for(int num2 : arr2){
            mp.put(num2,mp.getOrDefault(num2,0)+1);
        }
        List<Integer> ls = new ArrayList<>();
        for(int x : mp.keySet()){
            ls.add(x);
        }
        return ls;
    }
    public static List<Integer> unionUsingSet(int[] arr1, int[] arr2){
        Set<Integer> st = new TreeSet<>();
        for(int num1 : arr1){
            st.add(num1);
        }
        for(int num2 : arr2){
            st.add(num2);
        }
        return new ArrayList<>(st);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println("Using set : " + unionUsingSet(arr1,arr2));
        System.out.println("Using map : " + unionUsingMap(arr1,arr2));
        System.out.println("Using two pointer : " + unionUsingTwoPointer(arr1,arr2));
    }
}
