class Solution {
    public int pr = 37;
    public int mod = 1000000007;
    public int strStr(String txt, String pat) {

        int n = txt.length();
        int m = pat.length();
        
        if(m>n){
            return -1;
        }

        long[] p = new long[n+1];
        long[] ha = new long [n];

        p[0]=1;
        long a=0;
        long b=0;

        for(int i=1;i<=n;i++){
            p[i]=p[i-1]*pr % mod;
        }
        
        for(int i=0;i<n;i++){
            ha[i]=((txt.charAt(i)-'a'+1)*p[i])%mod;
        }

        for(int i=0;i<m;i++){
            b=(b+(pat.charAt(i)-'a'+1)*p[i])%mod;
            a=(a+ha[i])%mod;
        }

        if(a==b){
            return 0;
        }
        int i=0;
        int j=m;

        while(j < n){

            a = (a - ha[i] + mod) % mod;  
            a = (a + ha[j]) % mod;        
            i++;
            j++;
            long current = (b *p[i]) % mod;

            if(current == a){
                return i;
            }
        }
        return -1;

        
    }
}