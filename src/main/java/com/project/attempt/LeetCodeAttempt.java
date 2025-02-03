package com.project.attempt;

import java.util.Arrays;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] nums1 = new int[]{3,4,5,1,2};
        System.out.println(checkIfArrayIsSortedAndRotated(nums1));

        int[] nums2 = new int[]{2,1,3,4};
        System.out.println(checkIfArrayIsSortedAndRotated(nums2));

        int[] nums3 = new int[]{1,2,3};
        System.out.println(checkIfArrayIsSortedAndRotated(nums3));

    }

    // This method returns true if the array was originally sorted and was rotated 0 or 1 times.
    public static boolean checkIfArrayIsSortedAndRotated(int[] nums) {

        // If a rotation occurred, we will use int rotationIndex to signify the index where it occurred.
        int rotationIndex = -1;

        // Assuming nums[] had been rotated at least once, originalNums[] will represent
        // what the array would have looked like prior to the rotation taking place.
        int[] originalNums = new int[nums.length];

        // This for-loop will test whether the nums[] array is in sorted ascending order or not.
        // If at any point it breaks sorted order, we will "un-rotate" the array at that index
        // and fill in the indexes of originalNums[] with the "un-rotated" version of nums[] array.
        for (int i = 1; i < nums.length ; i++) {

            // If we haven't "un-rotated" the array yet and the current index has a smaller value
            // than the previous index, we set int rotationIndex to the current index.
            if (rotationIndex == -1 && nums[i-1] > nums[i]) { rotationIndex = i; }

            // We will then start filling in the beginning indexes of the originalNums[] array
            // with the rest of the values in the nums[] array as part of the "un-rotating" process.
            if (rotationIndex != -1) { originalNums[i-rotationIndex] = nums[i]; }

        }

        // If int rotationIndex is still -1 at this point, it means nums[] is already
        // completely sorted, and we do not need any further logic here.
        if (rotationIndex == -1) { return true; }

        // Otherwise, we fill in the rest of originalNums[] with the values at the indexes of
        // nums[] array that we looped over earlier before int rotationIndex was given a value.
        for (int i = 0; i < rotationIndex; i++) {

            originalNums[nums.length-rotationIndex+i] = nums[i];

        }

        // We then perform a sort operation on the original nums[] array.
        Arrays.sort(nums);

        // If nums[] and originalNums[] are equal now (i.e. both are in sorted ascending order)
        // then it means that only one rotation was performed on originalNums[] to achieve nums[].
        // This satisfies the challenge specifications, so we return true if so.
        return Arrays.equals(nums, originalNums);

    }

}
