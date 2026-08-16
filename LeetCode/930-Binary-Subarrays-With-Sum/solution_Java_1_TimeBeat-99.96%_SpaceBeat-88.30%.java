class Solution {
    public int check(int[] nums,int k){

        int n = nums.length;
        int sum=0,count=0;
        int i=0,j=0;

        while(j<n){
            sum+=nums[j];
            while(sum>k && i<=j ) sum-=nums[i++];
            count+=(j-i+1);
            j++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int k) {

        return check(nums,k)-check(nums,k-1);
        
    }
}