class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] a={-1,-1};
        for(int i=0;i<nums.length;i++){
            if (nums[i]==target){
                a[0]=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if (nums[i]==target){
                a[1]=i;
                break;
            }
        }
        if(a[0]!=-1&&a[1]!=-1){
            return a;
        }
        else{
            int[] x={-1,-1};
    
            return x;
        }
        
    }
}