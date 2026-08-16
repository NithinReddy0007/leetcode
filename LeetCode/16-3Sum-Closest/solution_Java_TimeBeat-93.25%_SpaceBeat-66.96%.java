class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int min = Integer.MAX_VALUE;
        int ans =0;


        for(int i=0;i<n;i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if (min>Math.abs(sum-target)){
                    ans=sum;
                    min=Math.abs(sum-target);
                }
                if(sum==target) return sum;
                else if(sum<target) j++;
                else k--;
            }
        }
        return ans;

        
        
    }
}