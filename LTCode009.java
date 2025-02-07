import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int mergedSize = m + n;
        
        int[] merged = new int[mergedSize];
        
        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }
        for (int i = m - 1, j = n - 1, k = m + n - 1; j >= 0; --k) {
            merged[k] = ((i >= 0) && (nums1[i] > nums2[j])) ? nums1[i--] : nums2[j--];
        }
        if (mergedSize % 2 == 1) {
            return merged[mergedSize / 2]; 
        } else {
            int mid1 = merged[mergedSize / 2 - 1];
            int mid2 = merged[mergedSize / 2];
            return (mid1 + mid2) / 2.0; 
        }

    }
}

class LTCode009{
    public static void main(String[] args) {
      
        Solution solution = new Solution();

        
        int[] nums1 = {1, 3};
        int[] nums2 = {2,4};
        System.out.println("Array 1: "+Arrays.toString(nums1));
        System.out.println("Array 2: "+Arrays.toString(nums2));
        double result = solution.findMedianSortedArrays(nums1, nums2);

      
        System.out.println("Median of the two sorted arrays: " + result);
    }
}