package org.example;

import java.util.Arrays;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] array = new int[nums.length];
        Arrays.fill(array, 1);
        int result = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    array[i] = Math.max(array[i], array[j] + 1);
                    result = Math.max(array[i], result);
                }
            }
        }
        return result;
    }
}
