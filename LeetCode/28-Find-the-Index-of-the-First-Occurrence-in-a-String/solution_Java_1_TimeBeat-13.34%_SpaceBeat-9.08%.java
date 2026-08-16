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

        p[0]=1;
        long a=0;
        long b=0;

        for(int i=1;i<=n;i++){
            p[i]=p[i-1]*pr % mod;
        }
        
        for(int i=0;i<m;i++){
            b=(b+((pat.charAt(i)-'a'+1)*p[i])%mod)%mod;
            a=(a+((txt.charAt(i)-'a'+1)*p[i])%mod)%mod;
        }

        if(a==b){
            return 0;
        }
        int i=0;
        int j=m;

        while(j < n){

            a = (a - ((txt.charAt(i)-'a'+1)*p[i])%mod + mod) % mod;  
            a = (a + ((txt.charAt(j)-'a'+1)*p[j])%mod) % mod;        
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