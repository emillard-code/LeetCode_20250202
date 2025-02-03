package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void specialArrayITest() {

        int[] nums1 = new int[]{3,4,5,1,2};
        assertTrue(LeetCodeAttempt.checkIfArrayIsSortedAndRotated(nums1));

        int[] nums2 = new int[]{2,1,3,4};
        assertFalse(LeetCodeAttempt.checkIfArrayIsSortedAndRotated(nums2));

        int[] nums3 = new int[]{1,2,3};
        assertTrue(LeetCodeAttempt.checkIfArrayIsSortedAndRotated(nums3));

    }

}
