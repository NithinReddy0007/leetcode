class Solution {

    public void rec(int[] nums,int idx,int target,List<Integer> temp,List<List<Integer>> ans){

        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(idx==nums.length) return;
        
        if(target>=nums[idx]){
            temp.add(nums[idx]);
            rec(nums,idx+1,target-nums[idx],temp,ans);
            temp.remove(temp.size()-1);
        }
        while(idx+1<nums.length && nums[idx]==nums[idx+1]){
            idx++;
        }
        rec(nums,idx+1,target,temp,ans);
    }



    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        rec(nums,0,target,new ArrayList<>(),ans);
        return ans;

        
    }
}