class Solution {
    public int missingNumber(int[] nums) {
       int sum=nums.length*(nums.length+1)/2;
        int sl=0;

        for(int i=0;i<nums.length;i++){
            sl=sl+nums[i];
        }
        return sum-sl;
    }
}