import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int x:nums){
            if(k==0||x!=nums[k-1]){
                nums[k++]= x;
            }
        }
        for(int i=k;i<nums.length;i++){
            nums[i] = 0;
        }
        return k;
    }
}
class LTCode006 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,4,5,5,5,6,7,7};
        Solution sol = new Solution();
        int result = sol.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(result+" is the length of the array after removing duplicates.");
    }
}