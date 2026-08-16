class Solution {
    public int no(int i,int j){
        int n = j-i+1;
        return n*(n+1)/2;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;
        int i=0;
        int j=0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(i<=j && map.size()>k){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0) map.remove(nums[i]);
                i++;
            }
            if(map.size()<=k) count+=(j-i+1);
            j++;
        }
        int count2=0;
        map.clear();
        i=0;
        j=0;
        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(i<=j && map.size()>k-1){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0) map.remove(nums[i]);
                i++;
            }
            if(map.size()<=k-1) count2+=(j-i+1);
            j++;
        }
        return count-count2;
        
    }
}