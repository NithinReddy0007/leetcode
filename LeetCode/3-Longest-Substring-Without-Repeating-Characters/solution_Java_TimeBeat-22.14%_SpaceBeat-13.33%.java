class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int n = s.length();

        int j = 0;
        int max_len = 0;

        for(int i=0;i<n;i++){
            while(j<i && set.contains(s.charAt(i))){
                set.remove(s.charAt(j++));
            }
            set.add(s.charAt(i));
            max_len=Math.max(max_len,i-j+1);
        }

        return max_len;
        
    }
}