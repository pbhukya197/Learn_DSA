/*
You are given a string 'S'. Your task is to check whether the string is palindrome or not. For checking palindrome,
consider alphabets and numbers only and ignore the symbols and whitespaces.

Note :

String 'S' is NOT case-sensitive.
Example :

Let S = “c1 O$d@eeD o1c”.
If we ignore the special characters, whitespaces and convert all uppercase letters to lowercase, we get S = “c1odeedo1c”,
which is a palindrome. Hence, the given string is also a palindrome.
 */

package dsa.basic;

import java.util.Scanner;

public class StringPalindrome {
    public static boolean getPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);
            if(!Character.isLetterOrDigit(c1)){
                left++;
            }
            else if(!Character.isLetterOrDigit(c2)){
                right--;
            }
            else{
                if(Character.toLowerCase(c1) != Character.toLowerCase(c2)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s= sc.nextLine();
            System.out.println(getPalindrome(s));
        }
    }
}
