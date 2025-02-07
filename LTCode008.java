class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m - 1, j = n - 1, k = m + n - 1; j >= 0; --k) {
            nums1[k] = i >= 0 && nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
    }
}
class LTCode008{
    public static void main(String[] args) {
      
        Solution solution = new Solution();

        
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        
        solution.merge(nums1, m, nums2, n);

      
        System.out.print("final array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

}