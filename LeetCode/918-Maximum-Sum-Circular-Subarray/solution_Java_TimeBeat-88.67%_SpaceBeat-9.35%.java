class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int total = 0;

        int min=0;
        int max=0;
        int min_sum=Integer.MAX_VALUE;
        int max_sum=Integer.MIN_VALUE;

        
        for(int i=0;i<n;i++){
            if(min>0){
                min=0;
            }
            min+=nums[i];
            min_sum=Math.min(min_sum,min);
            if(max+nums[i]<nums[i]){
                max=0;
            }
            max+=nums[i];
            max_sum=Math.max(max_sum,max);
            total+=nums[i];
        }
        if(max_sum<0) return max_sum;
        return Math.max(max_sum,total-min_sum);
    }
}