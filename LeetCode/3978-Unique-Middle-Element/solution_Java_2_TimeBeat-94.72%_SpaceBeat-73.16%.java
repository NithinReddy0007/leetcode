class Solution {
    public boolean isMiddleElementUnique(int[] nums) {

        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==nums[n/2] && i!=n/2) return false;
        }

        return true;
        
    }
}