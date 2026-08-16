class Solution {
    public long countCommas(long n) {
        long count = 0;
        long x = 1000;
        long ans = 0;
        while(x<=n){
            long y = Math.min(n,x*1000-1);
            count+=1;
            ans=ans+count*(y-x+1);
            x=x*1000; 
        }
        return ans;
        
    }
}