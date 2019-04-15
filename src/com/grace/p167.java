package com.grace;

import java.util.HashMap;
import java.util.Map;

public class p167 {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int[] ans = twoSum(numbers,9);
//        System.out.println(ans);
//        for(int i=0;i<ans.length;i++) {
//            System.out.println(ans[i]);
//        }
    }
    public static int[] twoSum(int[] numbers,int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=numbers.length;i++) {
            map.put(i,numbers[i-1]);
        }
        int j;
        for (j=1;j<=numbers.length;j++) {
            if(map.containsKey(target-numbers[j]) && map.get(target-numbers[j])!= j) {
                break;
            }
        }
        System.out.println(map.get(target-numbers[j]));
        return new int[] {j,(map.get(target-numbers[j]))};

//        throw  new IllegalArgumentException("np");
    }
}
