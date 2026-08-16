class Solution {
    public int shipWithinDays(int[] nums, int days) {

        int low = 0;
        int high = 0;

        for(int el : nums){
            low=Math.max(low,el);
            high+=el;
        }

        int ans = high;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(valid(nums,mid,days)){
                ans = mid;
                high=mid-1;
            } else {
                low = mid+1;
            }
        }

        return ans;
  
    }

    public boolean valid(int[] nums,int mid,int d){

        int count=0;
        int days = 1;

        for(int i=0;i<nums.length;i++){
            if(count+nums[i]<=mid){
                count+=nums[i];
            } else {
                count=nums[i];
                days+=1;
            }
        }
        return days<=d;
    }
}