package dsa.arrays;

import java.util.*;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr){
        int n = arr.length;
        if(n == 0){
            return 0;
        }
        int i = 0;
        for(int j=1;j<n;j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return (i+1); // Total number of unique elements
    }
    public static ArrayList<Integer> removeduplicates(int[] arr){
        int n = arr.length;
        HashSet<Integer> st = new LinkedHashSet<>();
        for(int x : arr){
            st.add(x);
        }
        return new ArrayList<>(st);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(removeduplicates(arr));
        System.out.println(removeDuplicates(arr));
    }
}
