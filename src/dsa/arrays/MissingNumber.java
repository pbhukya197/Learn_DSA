package dsa.arrays;

import java.util.Scanner;

public class MissingNumber {
    public static int missingNumberRange(int[] arr){
        int n = arr.length+1;
        int sum = 0;
        int first = arr[0];
        int last = arr[arr.length-1];
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        int expectedSum = (n * (first + last) / 2);  // in the given range
        return expectedSum - sum;
    }
    public static int missingNumber(int[] arr){
        long sum = 0;
        long n = arr.length+1;
        for(int i=0;i< arr.length;i++){
            sum += arr[i];
        }
        long expectedSum = (n * (n + 1) / 2);  // sum of first n natural numbers
        return (int)(expectedSum-sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Missing number in the given range : " + missingNumber(arr));
        System.out.println("The Missing number in the given range : " + missingNumberRange(arr));
    }
}
