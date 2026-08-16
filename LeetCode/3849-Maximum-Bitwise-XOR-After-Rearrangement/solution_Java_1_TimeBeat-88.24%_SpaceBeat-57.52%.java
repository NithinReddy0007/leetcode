class Solution{
    public String maximumXor(String s,String t){
        int ones=0;
        for(char c:t.toCharArray()){
            if(c=='1') ones++;
        }

        int zeros=t.length()-ones;
        char[] ans=new char[s.length()];

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                if(ones>0){
                    ans[i]='1';
                    ones--;
                }else{
                    ans[i]='0';
                }
            }else{
                if(zeros>0){
                    ans[i]='1';
                    zeros--;
                }else{
                    ans[i]='0';
                }
            }
        }

        return new String(ans);
    }
}