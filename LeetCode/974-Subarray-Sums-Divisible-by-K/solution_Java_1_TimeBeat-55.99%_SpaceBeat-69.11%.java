class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,1);
        int count=0;
        for(int el : nums){
            sum+=el;
            int r = ((sum%k)+k)%k;
            if(map.containsKey(r)){
                count+=map.get(r);
            }
            map.put(r,map.getOrDefault(r,0)+1);
        }
        return count;
        
    }
}