package leetcode.easy;

import java.util.*;

public class TwoSum {
    public int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int length = list.size();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println(map);
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum match found");
    }

    public static void main(String[] args) {
        try {
            TwoSum twoSum = new TwoSum();
            System.out.println(Arrays.toString(twoSum.findTwoSum(new int[]{1, 4, 2, 42, 23}, 5)));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
