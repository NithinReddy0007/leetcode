class Solution {
    public int check(String s,int i,int j){
        int count = 0;
        while(i<j){
            int diff = 0;
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
                continue;
            }
            if(s.charAt(i)<s.charAt(j)){
                diff = diff+(-97+s.charAt(i))+(122-s.charAt(j));
            } else {
                diff = diff+(-97+s.charAt(j))+(122-s.charAt(i));

            }
            count+=Math.min(Math.abs(s.charAt(i)-s.charAt(j)),diff+1);
            i++;
            j--;
        }
        return count;
    }
    public int minOperations(String s) {

        int i=0;
        int n = s.length();
        int j = n-1;
        s=s+s;

        int count = check(s,0,n-1);
        System.out.println(count);
        for(i=1;i+n<2*n;i++){
            count = Math.min(count,check(s,i,i+n-1)+i);
            //System.out.println(count);
        }
        

        return count;
        
    }
}