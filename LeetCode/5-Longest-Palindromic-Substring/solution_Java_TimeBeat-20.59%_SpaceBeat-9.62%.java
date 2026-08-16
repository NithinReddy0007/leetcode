class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = "";
        int max_len=0;
        for(int i=0;i<n;i++){
            int p1=i;
            int p2=i;
            while(p1>=0 && p2<=n-1 && s.charAt(p1)==s.charAt(p2)){
                p1--;
                p2++;
            }
            if(max_len<p2-p1-1){
                max_len=p2-p1-1;
                ans="";
                for(int j=p1+1;j<p2;j++){
                    ans=ans+s.charAt(j);
                }
            }
            p1=i;
            p2=i+1;
            while(p1>=0 && p2<=n-1 && s.charAt(p1)==s.charAt(p2)){
                p1--;
                p2++;
            }
            if(max_len<p2-p1-1){
                max_len=p2-p1-1;
                ans="";
                for(int j=p1+1;j<p2;j++){
                    ans=ans+s.charAt(j);
                }
            }
        }
        return ans;
        
    }
}