package top.interview.question;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public static void main(String[] args) {
        int[] nums = {3,3}; //{2,7,11,15}  / {3,2,4}
        int target = 6; // 9   /   6
        int[] res = twoSum(nums, target); //twoSum(nums, target);
    }

    public static int[] twoSumSol(int[] nums, int target) {
        Map hash = new HashMap<Integer, Integer>();

        for( int i = 0 ; i < nums.length; i++) {
            int expectedNum = target - nums[i];
            if( hash.get(expectedNum) != null) return new int[]{(int)hash.get(expectedNum), i};
            hash.put(nums[i], i);
        }
        return null;
    }

    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }
}
