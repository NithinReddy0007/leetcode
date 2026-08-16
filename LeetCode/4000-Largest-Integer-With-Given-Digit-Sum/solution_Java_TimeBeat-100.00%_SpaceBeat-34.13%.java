class Solution {
    public int largestInteger(int n, int s) {

        if(s==0) return 0;

        if(n*9<s) return -1;

        int ans = 0;
        while(n>0){
            int i=9;
            for(i=9;i>=0;i--){
                if(i<=s) break;
            }
            ans = ans*10+i;
            s=s-i;
            n-=1;
        }
        return ans;
        
    }
}