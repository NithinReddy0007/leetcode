class Solution {
    public int[] arrayRankTransform(int[] nums) {

        TreeMap<Integer,Integer> map = new TreeMap<>();

        int n = nums.length;

        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i],0);
        }

        int j=1;
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

            map.put(entry.getKey(),j++);
        }

        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i]=map.get(nums[i]);
        }


        return ans;
        
    }
}