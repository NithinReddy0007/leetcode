class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int i=0;
        while(i<n){
            if(nums[i]>0) return ans;
            
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j-1]==nums[j]) j++;
                    while(j<k && nums[k+1]==nums[k]) k--;
                }
                else if(sum<0){
                    j++;
                    while(j<k && nums[j-1]==nums[j]) j++;
                }
                else {
                    k--;
                    while(j<k && nums[k+1]==nums[k]) k--;
                }
            }
            i++;
            while(i < n && nums[i] == nums[i-1]) i++;
        }
        return ans;
        
    }
}