package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void checkTest() {

        int[] nums1 = new int[]{3,4,5,1,2};
        assertTrue(LeetCodeSolution.check(nums1));

        int[] nums2 = new int[]{2,1,3,4};
        assertFalse(LeetCodeSolution.check(nums2));

        int[] nums3 = new int[]{1,2,3};
        assertTrue(LeetCodeSolution.check(nums3));

    }

}
