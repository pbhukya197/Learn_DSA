package dsa.arrays;

import java.util.Scanner;

public class StockBuySell {
    public static int stockbuySell(int[] price){
        int profit = 0;
        for(int i=1;i<price.length;i++){
            if(price[i] > price[i-1]){
                profit += price[i] - price[i-1];
            }
        }
        return profit;
    }
    // Only for One Transcation
    public static int stockBuySell(int[] price){
        int buy = price[0];
        int profit = 0;
        for(int i=1;i<price.length;i++){
            if(price[i] < buy){
                buy = price[i];
            }else if(price[i] - buy > profit){
                profit = price[i] - buy;
            }
        }
        return profit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for(int i=0;i<n;i++){
            price[i] = sc.nextInt();
        }
        System.out.println(stockBuySell(price));
        System.out.println(stockbuySell(price));
    }
}
