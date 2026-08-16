class Solution {

    public int costt(int n) {
        long mod = 1000000007;
        long ans = (1L*n*(n+1)/2)%mod;
        return (int)ans;
    }
    public int minimumCost(int[] nums, int k) {

        int n = nums.length;
        int pre = k;
        int cost = 0;
        int ith = 0;
        int mod = 1000000007;

        for(int i=0;i<n;i++){
            if(nums[i]<=pre){
                pre=pre-nums[i];
            } else {
                int rem = (nums[i]-pre+k-1)/k;
                pre = k * rem + pre;
                ith = (ith + rem)%mod;
                pre=pre-nums[i];                
            } 
        }

        return costt(ith);
        
    }
}