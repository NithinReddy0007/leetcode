class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,1);
        int count=0;
        for(int el : nums){
            sum+=el;
            if(map.containsKey(((sum%k)+k) % k)){
                count+=map.get(((sum%k)+k) % k);
            }
            map.put(((sum%k)+k) % k,map.getOrDefault(((sum%k)+k) % k,0)+1);
        }
        return count;
        
    }
}