class Solution {
    public int countCommas(int n) {
        if(n<1000) return 0;
        int x=1000;
        int count=0;
        while(x<=n){
            x=x*1000;
            count+=1;
        }
        return count*(n-999);    
    }
}