class Solution {
    public String maximumXor(String s, String t) {
        int count1=0;
        int count0=0;

        for(char el : t.toCharArray()){
            if(el=='1') count1+=1;
            else{
                count0+=1;
            }
        }
        char[] temp1 = s.toCharArray();
        char[] temp2 = t.toCharArray();

        for(int i=0;i<temp1.length;i++){
            if(temp1[i]=='0'){
                if(count1!=0){
                    temp2[i]='1';
                    count1--;
                }
                else{
                    temp2[i]='0';
                    count0--;
                }
            } 
            else {
                if(count0!=0){
                    temp2[i]='0';
                    count0--;
                }
                else{
                    temp2[i]='1';
                    count1--;
                }   
            }
        }

        char[] ans = new char[s.length()];

        for(int i=0;i<s.length();i++){
            if(temp1[i]==temp2[i]){
                ans[i]='0';
            }
            else{
                ans[i]='1';
            }
        }
        return String.valueOf(ans);
        
    }
}