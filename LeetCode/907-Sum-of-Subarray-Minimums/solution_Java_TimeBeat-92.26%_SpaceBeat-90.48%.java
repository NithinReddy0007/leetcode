class Solution {
    public int sumSubarrayMins(int[] nums) {


        long ans = 0;
        int n =nums.length;
        int[] ps = new int[n];
        int[] ns = new int[n];

        Deque<Integer> st = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[i]<=nums[st.peek()]) st.pop();
            ps[i] = st.isEmpty()?-1:st.peek(); 
            st.push(i);
        }

        st.clear();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]<nums[st.peek()]) st.pop();
            ns[i] = st.isEmpty()?n:st.peek(); 
            st.push(i);
        }

        for(int i=0;i<n;i++){
            ans = (ans + 1L * (i - ps[i]) * (ns[i] - i) * nums[i])%1000000007;

        }

        return (int)ans;




        
    }
}