class Solution {
    public int firstUniqueEven(int[] nums) {
        int[] count = new int[100];
        for(int el : nums){
            count[el-1]++;
        }
        for(int el : nums){
            if(count[el-1]==1 && (el)%2==0) return el;
        }
        return -1;
        
    }
}