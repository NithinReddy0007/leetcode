class Solution {
    public int trap(int[] nums) {
        int n = nums.length;
        int p1=0;
        int p2=n-1;
        int lm=0;
        int rm=0;
        int total=0;

        while(p1<p2){

            if(nums[p1]<nums[p2]){
                lm=Math.max(nums[p1],lm);
                total+=lm-nums[p1];
                p1++;
            } else {
                rm=Math.max(nums[p2],rm);
                total+=rm-nums[p2];
                p2--;
            }
        }
        return total;
        
    }
}