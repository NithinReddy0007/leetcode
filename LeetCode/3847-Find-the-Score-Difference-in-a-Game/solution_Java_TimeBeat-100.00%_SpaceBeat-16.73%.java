class Solution {
    public int scoreDifference(int[] nums) {
        int first=0;
        int second = 0;
        boolean f = true;
        boolean s = false;
        int n = nums.length;

        for(int i=0;i<n;i++){
            if((i+1)%6==0){
                if(nums[i]%2!=0){
                    if(f){
                        first+=nums[i];
                    }
                    else{
                        second+=nums[i];
                    }
                }
                else{
                    if(!f){
                        first+=nums[i];
                        f=true;
                        s=false;
                    }
                    else{
                        second+=nums[i];
                        s=true;
                        f=false;
                    }
                }          
            }
            else if(nums[i]%2!=0){
                if(!f){
                    first+=nums[i];
                    f=true;
                    s=false;
                }
                else{
                    second+=nums[i];
                    s=true;
                    f=false;
                }
            } else {
                if(f){
                    first+=nums[i];
                }
                else{
                    second+=nums[i];
                }
                
            }
            
        }
        return first-second;
        
    }
}