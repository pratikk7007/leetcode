class Solution {
    public int[] searchRange(int[] nums, int target) {

        int arr[]={-1,-1};
        int first=-1;
        int last=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }
        arr[0]=first;
        arr[1]=last;
        return arr;
        
    }
}