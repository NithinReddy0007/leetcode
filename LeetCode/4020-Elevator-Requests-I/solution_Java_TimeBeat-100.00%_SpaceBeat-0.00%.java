class Solution {
    public int elevatorRequests(int n, int[] nums) {

        int prev = 0;
        int time = 0;
        for(int el : nums){
            time+=Math.abs(prev-el);
            prev=el;
        }

        return time;
        
    }
}