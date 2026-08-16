class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int idx = -1;
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(min>Math.abs(nums[i])){
                idx=i;
                min=Math.abs(nums[i]);
            }
        }

        System.out.println(idx);

        int i = idx-1;
        int j = idx+1;
        int k = 1;

        int[] ans = new int[n];
        ans[0] = nums[idx]*nums[idx];

        while(i>=0 && j<n){
            int x = Math.abs(nums[i]);
            int y = Math.abs(nums[j]);

            if(x<y){
                ans[k++]=x*x;
                i--;
            } else {
                ans[k++]=y*y;
                j++;
            }
            
            
        }

        while(i>=0){
            ans[k++]=nums[i]*nums[i];
            i--;
        }

        while(j<n){
            ans[k++]=nums[j]*nums[j];
            j++;
        }

        return ans;
        
    }
}