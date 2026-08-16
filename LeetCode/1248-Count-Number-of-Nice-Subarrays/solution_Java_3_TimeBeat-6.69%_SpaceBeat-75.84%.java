class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int ans = 0;
        map.put(0,1);
        for(int el :  nums){
            if(el%2!=0) count+=1;
            ans+=map.getOrDefault(count-k,0);
            map.put(count,map.getOrDefault(count,0)+1);
        }
        return ans;
        
    }
}