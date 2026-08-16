class Solution {

    public void back(int[] nums,int idx,int n,boolean[] freq,List<Integer> temp,List<List<Integer>> ans){
        if(idx==n){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=0;i<n;i++){
            if(!freq[i]){
                freq[i]=true;
                temp.add(nums[i]);
                back(nums,idx+1,n,freq,temp,ans);
                freq[i]=false;
                temp.remove(temp.size()-1);
            }
        }
    }





    public List<List<Integer>> permute(int[] nums) {

        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[n];
        back(nums,0,n,freq,new ArrayList<>(),ans);
        return ans;
    }
}