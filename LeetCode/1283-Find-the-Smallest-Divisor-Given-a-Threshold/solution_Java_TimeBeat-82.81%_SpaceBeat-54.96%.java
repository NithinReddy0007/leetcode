class Solution {

    public boolean div(int[] nums,int mid,int t){
        int sum = 0;
        for(int el : nums){
            sum+=(el+mid-1)/mid;
        }
        return sum<=t;
    }
    public int smallestDivisor(int[] nums, int t) {

        int low = 1;
        int high = Integer.MIN_VALUE;

        for(int el : nums){
            high=Math.max(high,el);
            //low=Math.min(low,el);
        }

        int ans = high;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(div(nums,mid,t)){
                ans = mid;
                high=mid-1;
            } else {
                low=mid+1;
            }
        }

        return ans;


        
    }
}