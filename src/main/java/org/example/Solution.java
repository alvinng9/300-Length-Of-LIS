package org.example;

import java.util.Arrays;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        //create a new int array with the same size as nums array
        int[] array = new int[nums.length];
        //fill the array with 1s
        Arrays.fill(array, 1);
        int result = 1;
        //iterate through the given array
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                //check if indexes before i is less than index i
                if (nums[i] > nums[j]) {
                    //increase the value at index i by 1 for the new array whenever the value of
                    //the nums array at index j is less than index i
                    array[i] = Math.max(array[i], array[j] + 1);
                    result = Math.max(array[i], result);
                }
            }
        }
        return result;
    }
}
