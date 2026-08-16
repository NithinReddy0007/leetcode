class Solution {

    public boolean canReach(int[] start, int[] target) {

        int a = Math.abs(target[0]-start[0]);
        int b = Math.abs(target[1]-start[1]);

        if((a+b)%2==0) return true;
        return false;
        
    }
}