package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lengthOfLISTest() {
        Solution solution = new Solution();
        assertEquals(4, solution.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
        assertEquals(4, solution.lengthOfLIS(new int[]{0,1,0,3,2,3}));
        assertEquals(1, solution.lengthOfLIS(new int[]{7,7,7,7,7,7,7}));
        assertEquals(1, solution.lengthOfLIS(new int[]{7,6,5,4,3,2,1}));
        assertEquals(3, solution.lengthOfLIS(new int[]{1,6,5,4,3,2,7}));
    }

}