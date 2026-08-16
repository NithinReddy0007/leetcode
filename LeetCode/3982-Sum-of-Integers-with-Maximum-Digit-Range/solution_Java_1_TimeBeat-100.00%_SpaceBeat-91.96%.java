class Solution {
    public int maxDigitRange(int[] nums) {

        int maxx = 0;
        int ans = 0;
        for(int i=0;i<nums.length;i++){

            int x = nums[i];
            int maxi = -1;
            int mini = Integer.MAX_VALUE;
            while(x>0){
                int r = x%10;
                maxi=Math.max(r,maxi);
                mini=Math.min(r,mini);
                x=x/10;
            }
            
            if(maxx==maxi-mini){
                ans=ans+nums[i];
            }
            if(maxx<maxi-mini){
                maxx=maxi-mini;
                ans=nums[i];
            }
        }

        return ans;
        
    }
}