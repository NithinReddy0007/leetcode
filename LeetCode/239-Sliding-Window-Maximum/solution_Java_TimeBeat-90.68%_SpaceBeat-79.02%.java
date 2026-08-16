class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> que = new ArrayDeque<>();
        int n = nums.length;

        int l = n-k+1;
        int[] ans = new int[l];

        int j = 0;

        for(int i=0;i<n;i++){
            if(!que.isEmpty() && que.peekFirst()<=i-k) que.removeFirst();

            while(!que.isEmpty() && nums[que.peekLast()]<=nums[i]) que.removeLast();

            que.addLast(i);


            if(i>=k-1) ans[j++]=nums[que.peekFirst()];
        }

        return ans;
                
    }
}