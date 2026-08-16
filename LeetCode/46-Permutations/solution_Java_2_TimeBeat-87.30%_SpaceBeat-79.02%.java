class Solution {

    public void back(int[] nums,boolean[] freq,List<Integer> temp,List<List<Integer>> ans){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                temp.add(nums[i]);
                back(nums,freq,temp,ans);
                freq[i]=false;
                temp.remove(temp.size()-1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        back(nums,freq,new ArrayList<>(),ans);
        return ans;
    }
}