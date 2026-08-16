class Solution {
    public void rec(int idx,int n , String temp,HashMap<String,String> map,List<String> ans,String s){
        if(temp.length()==n){
            ans.add(temp);
            return;
        }
        String f = map.get(String.valueOf(s.charAt(idx)));
        for(char el : f.toCharArray()){
            rec(idx+1,n,temp+el,map,ans,s);
        }
    }
    public List<String> letterCombinations(String s) {
        List<String> ans = new ArrayList<>();
        HashMap<String,String> map = new HashMap<>();
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        rec(0,s.length(),"",map,ans,s);
        return ans;
    }
}