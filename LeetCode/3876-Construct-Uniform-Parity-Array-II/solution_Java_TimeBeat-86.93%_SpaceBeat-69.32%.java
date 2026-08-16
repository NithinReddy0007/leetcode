class Solution {
    public boolean uniformArray(int[] nums1) {

        int odd=0;
        int even = 0;
        int odd_min=Integer.MAX_VALUE;
        int even_min=Integer.MAX_VALUE;

        for(int el : nums1){
            if(el%2==0){
                even+=1;
                even_min=Math.min(even_min,el);
            }
            else{
                odd+=1;
                odd_min=Math.min(odd_min,el);
            } 
        }

        if (even==0 || odd==0) return true;

        return even_min>odd_min;
        

        
        
        
    }
}