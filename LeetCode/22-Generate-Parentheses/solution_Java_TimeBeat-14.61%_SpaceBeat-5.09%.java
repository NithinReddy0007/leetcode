class Solution {

    public static void paren(ArrayList<String> a,String s,int idx,int n,int count){
        if(count<0){
            return;
        }
        if(idx==n){
            if(count == 0){
                a.add(s);
                return;
            }
            else{
                return ;
            }
        }
        
        paren(a, s + "(" ,idx+1,n,count+1);
        paren(a, s + ")" ,idx+1,n,count-1);
    }

    public List<String> generateParenthesis(int n) {
        ArrayList<String> a = new ArrayList<>();
        paren(a,"",0,2*n,0);
        return a;
    }
}