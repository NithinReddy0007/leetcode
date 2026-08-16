class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        int n= nums.length;

        while(i<n){
            int cor = nums[i]-1;
            if(nums[i]!=i+1 && nums[cor]!=nums[i]){
                int temp = nums[cor];
                nums[cor]=nums[i];
                nums[i]=temp;
            }
            else{
                i+=1;
            }
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
                return nums[j];
            }
        }
        return n;
    }
}
