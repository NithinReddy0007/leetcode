class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length<=1){
            return;
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
            if (i==nums.length-1){
                for(int k=j;k<nums.length;k++){
                    nums[k]=0;
                }
            }
        }
        
    }
}