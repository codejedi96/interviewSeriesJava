package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MergeSortedArrayTest {
    @Test
    @DisplayName("nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 returns [1,2,2,3,5,6]")
    void test1() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        mergeSortedArray.merge(nums1, 3, nums2, 3);
        Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    @DisplayName("nums1 = [1], m = 1, nums2 = [], n = 0 returns [1]")
    void test2() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 =new int[]{1};
        int[] nums2 = new int[]{};
        mergeSortedArray.merge(nums1, 1, nums2, 0);
        Assertions.assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    @DisplayName(" nums1 = [0], m = 0, nums2 = [1], n = 1 returns [1]")
    void test3() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 =new int[]{0};
        int[] nums2 =  new int[]{1};
        mergeSortedArray.merge(nums1, 0, nums2, 1);
        Assertions.assertArrayEquals(new int[]{1}, nums1);
    }
}