class Solution {
    public int numberOfSubstrings(String s) {

        int n = s.length();

        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        int j=0;

        int count=0;

        while(j<n){
            char x = s.charAt(j);
            map.put(x,map.getOrDefault(x,0)+1);
            while(i<j && map.size()==3){
                count+=(n-j);
                char y = s.charAt(i);
                map.put(y,map.get(y)-1);
                if(map.get(y)==0) map.remove(y);
                i++;
            }
            j++;
        }
        return count;
        
    }
}