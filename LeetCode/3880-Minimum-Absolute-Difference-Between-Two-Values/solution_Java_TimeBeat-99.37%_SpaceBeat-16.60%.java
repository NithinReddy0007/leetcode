class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int x=-1;
        int y=-1;
        
        int n = nums.length;
        int min= n+1;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                x=i;
            }
            if(nums[i]==2){
                y=i;
            }
            if(x!=-1 && y!=-1) min=Math.min(min,Math.abs(x-y));
        }
        if(min==n+1) return -1;
        return min;

        
        
    }
}