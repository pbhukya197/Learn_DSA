package zorvyn;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCount {

    /**
     * Use a hash map to count how many times each element appears — instead of repeatedly scanning the array
     * Check all the Edge Cases
     * [], null, [1,1,2,2], [3,7,9], [42], [1,1,2,2,5], [-1,-1,-2], [1000000,999,...]
     * Time Complexity - O(n)
     * Space Complexity - O(n)
     */
    public static int countFrequency(int[] nums){
        if(nums == null || nums.length == 0){
            return -1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int x : nums){
            if(map.get(x)==1){
                return x;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(countFrequency(nums));
    }

}
