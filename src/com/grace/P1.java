package com.grace;

import java.util.HashMap;
import java.util.Map;

public class P1 {
    public static void main(String[] args) {
        int[] ans = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(ans);
    }

    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(i, nums[i]);
        }
        for (int i = 0; i < len; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                return new int[]{i, map.get(target - nums[i])};
            }
        }
        throw new IllegalArgumentException("no");

    }
}
