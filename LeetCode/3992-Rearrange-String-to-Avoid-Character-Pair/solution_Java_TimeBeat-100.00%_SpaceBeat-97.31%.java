class Solution {
    public String rearrangeString(String str, char x, char y) {

        char[] s = str.toCharArray();
        int j = s.length-1;

        for(int i=0;i<s.length;i++){
            if(s[i]!=x) continue;
            while(j>=0 && y!=s[j]) j--;
            if(i>j) break;
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
        }

        return String.valueOf(s);

        
    }
}