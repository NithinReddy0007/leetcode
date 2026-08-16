class Solution {
    public int jump(int[] nums) {
        
        int n = nums.length;
        int l=0,r=0;
        int count=0;

        while(r<n-1){
            
            int far=0;

            for(int i=l;i<=r;i++){
                far=Math.max(i+nums[i],far);
            }

            count++;
            l=r+1;
            r=far;   
        }
        return count;


    }
}