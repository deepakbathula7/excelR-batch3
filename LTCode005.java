import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int indi[] = new int[2];
        for(int i =0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target&&i!=j){
                    indi[0] = i;
                    indi[1] = j;
                    break;
                }
            }
        }
       
        return indi;
    }
}

class LTCode005{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0;i<n;i++){
            System.out.print("Enter the element "+(i+1)+" : ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        Solution sol = new Solution();
        int result[] = sol.twoSum(nums, target);
        if(result[0]==0&&result[1]==0){
            System.out.println("No such pair found");
        }else{
            System.out.println(result[0]+" "+result[1]);
        }
    }
}