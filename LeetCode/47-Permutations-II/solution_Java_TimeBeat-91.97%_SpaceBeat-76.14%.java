class Solution {

    public void rec(int[] nums,ArrayList<Integer> temp,List<List<Integer>> ans,int[] map){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(i > 0 && nums[i] == nums[i-1] && map[i-1]==0) continue;
            if(map[i]==0){

                map[i]=1;
                temp.add(nums[i]);
                rec(nums,temp,ans,map);
                temp.remove(temp.size()-1);
                map[i]=0;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        int[] map = new int[nums.length];
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        rec(nums,new ArrayList<>(),ans,map);
        return ans;

    }
}