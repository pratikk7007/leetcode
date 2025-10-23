class Solution {
    public void moveZeroes(int[] nums) {

        int temp[] = new int[nums.length];
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp[idx] = nums[i];
                idx++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }

        for (int i = idx; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
