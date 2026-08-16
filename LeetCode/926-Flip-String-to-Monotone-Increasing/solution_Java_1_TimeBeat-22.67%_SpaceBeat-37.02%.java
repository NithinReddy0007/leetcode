class Solution {
    public int minFlipsMonoIncr(String s) {
        int n = s.length();
        int zero=0;
        int one=0;
        int index=-1;
        boolean valid = false;

        for(int i=0;i<n;i++){
            char x = s.charAt(i);
            if(!valid && x=='1'){
                index = i;
            }
            if(x=='1'){
                valid=true;
                one++;
            }
            if(x=='0' && valid){
                zero++;
            }
        }

        if(index==-1) return 0;

        int ans = Math.min(zero,one);

        int count1=0;
        int count0=0;
        
        for(int i=index;i<n;i++){
            char x = s.charAt(i);
            if(x=='0') count0+=1;
            else count1+=1;
            ans=Math.min(ans,zero-count0+count1);
        }

        return ans;

        

        


        
    }
}
