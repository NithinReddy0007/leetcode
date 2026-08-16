class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int l=0;
       int h=0;
       int min = nums.length+1;
       int sum=0;
       int len=Integer.MIN_VALUE;
       while(h<nums.length){
        sum=sum+nums[h];
        while(sum-nums[l]>=target){
            sum=sum-nums[l];
            l++;
        }
        if(sum>=target)
        min=Math.min(min,h-l+1);
        h++;
       } 
       if(min==nums.length+1) return 0;
       return min;
    }
}