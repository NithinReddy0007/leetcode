class Solution {
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int max = nums[0];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int el : nums){
            max=Math.max(max,el);
            ans.add(gcd(el,max));
        }
        Collections.sort(ans);
        long sum=0;
        int i=0;
        int j=ans.size()-1;
        while(i<j){
            sum+=gcd(ans.get(i),ans.get(j));
            i++;
            j--;
        }
        return sum;
    }
}