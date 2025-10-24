class Solution {

    public int f(int arr[],int low,int high,int target){
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;

        if(arr[mid]==target){
            return mid;
        }
        else if(target>arr[mid]){
            return f(arr,mid+1,high,target);
        }
        else
            return f(arr,low,mid-1,target);

        
    }
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        return f(nums,low,high,target);
    }
}