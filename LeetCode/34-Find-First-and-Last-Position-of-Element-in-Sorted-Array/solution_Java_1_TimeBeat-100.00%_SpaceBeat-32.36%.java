class Solution {

    public int first(int[] nums,int low,int high,int target){

        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(nums[mid]==target){
                ans = mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        return ans;
    }

    public int second(int[] nums,int low,int high,int target){

        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                ans = mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        return ans;
        
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums,0,nums.length-1,target),second(nums,0,nums.length-1,target)};
    }
}