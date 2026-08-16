class Solution {
    public int firstUniqueFreq(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] a = new int[100001];
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans = 0;
        for(int el : map.keySet()){
            a[map.get(el)]++;
        }

        for(int el : nums){
            if(a[map.get(el)]==1){
                return el;
            }
        }
        return -1;
        
        
        
    }
}