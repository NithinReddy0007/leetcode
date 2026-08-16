class Solution {

    public void rec(int[] nums,int idx,int target,List<Integer> temp,List<List<Integer>> ans){

        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(idx==nums.length) return;
        
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i-1]==nums[i]) continue;
            if(nums[i] > target) break;
            temp.add(nums[i]);
            rec(nums,i+1,target-nums[i],temp,ans);
            temp.remove(temp.size()-1);
        }
    }



    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        rec(nums,0,target,new ArrayList<>(),ans);
        return ans;

        
    }
}