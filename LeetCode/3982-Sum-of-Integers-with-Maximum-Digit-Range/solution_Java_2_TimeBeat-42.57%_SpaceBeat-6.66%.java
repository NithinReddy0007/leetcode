class Solution {
    public int maxDigitRange(int[] nums) {

        int maxx = 0;
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int x = nums[i];
            int maxi = -1;
            int mini = Integer.MAX_VALUE;
            while(x>0){
                int r = x%10;
                maxi=Math.max(r,maxi);
                mini=Math.min(r,mini);
                x=x/10;
            }
            
            maxx=Math.max(maxi-mini,maxx);

            map.put(maxi-mini,map.getOrDefault(maxi-mini,0)+nums[i]);
        }

        return map.get(maxx);
        
    }
}