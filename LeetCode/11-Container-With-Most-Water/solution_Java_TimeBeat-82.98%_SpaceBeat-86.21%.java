class Solution {
    public int maxArea(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=n-1;
        int max_area= Integer.MIN_VALUE;

        while(i<j){
            int area = Math.min(nums[i],nums[j])*(j-i);
            max_area=Math.max(max_area,area);
            if(nums[i]<nums[j]) i++;
            else j--;
        }
        return max_area;

        
    }
}