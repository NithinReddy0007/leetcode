class Solution {
    public int fact(int n){
        if(n==0 || n==1) return 1;
        else if(n==2) return 2;
        else if(n==3) return 6;
        else if(n==4) return 24;
        else if(n==5) return 120;
        else if(n==6) return 720;
        else if(n==7) return 5040;
        else if(n==8) return 40320;
        else return 362880;
    }
    public boolean isDigitorialPermutation(int n) {
        int sum = 0;
        int[] count1 = new int[10];
        int t = n;
        while(t>0){
            sum=sum+fact(t%10);
            count1[t%10]+=1;
            
            t=t/10;
        }

        if(sum==n) return true;
        
        t=sum;
        int[] count2 = new int[10];
        
        while(t>0){
            count2[t%10]+=1;            
            t=t/10;
        }

        for(int i=0;i<10;i++){
            if(count1[i]!=count2[i]) return false;
        }
        return true;

        
        
    }
}