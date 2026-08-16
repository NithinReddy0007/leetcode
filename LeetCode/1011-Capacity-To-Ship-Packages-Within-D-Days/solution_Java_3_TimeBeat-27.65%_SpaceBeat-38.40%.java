class Solution {
    public int check(int[] nums, int cap){
        int count=1;
        long c = 0;
        for(int i=0;i<nums.length;i++){
            if(c+nums[i]<=cap){
                c+=nums[i];
            } else {
                count++;
                c=nums[i];
            }
        }
        return count;
    }
    public int shipWithinDays(int[] nums, int days) {

        int n = nums.length;
        int low = 0;
        int high = 0;

        for(int i=0;i<n;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        int ans = high;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(check(nums,mid)<=days){
                ans = mid;
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return ans;
    }
}