class Solution {
    public int numberOfSubstrings(String s) {

        int n = s.length();
        int i=0;
        int count=0;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int j=0;j<n;j++){
            char c = s.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.size()==3){
                char x = s.charAt(i);
                count+=(n-j);
                int y = map.get(x);
                map.put(x,y-1);
                if(y==1) map.remove(x);
                i++;
            }
        }
        
        return count;
        
    }
}