class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(String el : strs){
            char[] a = el.toCharArray();
            Arrays.sort(a);
            String sor = String.valueOf(a);
            if(map.containsKey(sor)){
                map.get(sor).add(el);
            }
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(el);
                map.put(sor, list);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String el : map.keySet()){
            ans.add(map.get(el));
        }
        return ans;
        
    }
}