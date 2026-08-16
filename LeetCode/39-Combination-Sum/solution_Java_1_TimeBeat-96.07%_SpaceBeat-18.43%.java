class Solution {

    public void rec(int[] nums,int idx,int target,List<Integer> temp,List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(idx == nums.length){
            return;
        }
        if(target>=nums[idx]){
            temp.add(nums[idx]);
            rec(nums,idx,target-nums[idx],temp,ans);
            temp.remove(temp.size()-1);
        }
        rec(nums,idx+1,target,temp,ans);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        rec(nums,0,target,new ArrayList<>(),ans);
        return ans;
    }
}