class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        System.out.println(Arrays.toString(nums));
        List<List<Integer>> ans = new ArrayList<>();
        if(nums[0]>0){
            return ans;
        }
        for(int i=0;i<n-2;i++){
            if(nums[i]>0){
                return ans;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j+=1;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j+=1;
                    k-=1;
                    while(j<k && nums[j]==nums[j-1]){
                        j+=1;
                    }
                    while(j<k && nums[k]==nums[k+1]){
                        k-=1;
                    }
                }
            }
        }
        return ans;
    }
}