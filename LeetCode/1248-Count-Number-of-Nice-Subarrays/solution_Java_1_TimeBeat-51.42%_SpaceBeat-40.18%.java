class Solution {

    public int check(int[] nums,int k){
        int n = nums.length;
        int count = 0;
        int ans=0;
        int i=0,j=0;

        while(j<n){
            count+= nums[j]%2==1 ? 1:0;
            while(count>k){
                count-=nums[i]%2==1 ? 1:0;
                i++;
            }

            ans+=(j-i+1);
            j++;
        }
        return ans;
        
    }


    public int numberOfSubarrays(int[] nums, int k) {
        
        return check(nums,k)-check(nums,k-1);
        
    }
}