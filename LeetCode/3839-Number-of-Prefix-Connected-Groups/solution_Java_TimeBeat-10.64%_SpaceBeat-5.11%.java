class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            StringBuilder sb = new StringBuilder();
            if(words[i].length()<k) continue;
            for(int j=0;j<k;j++){
                sb.append(words[i].charAt(j));
            }
            map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
        }
        int count=0;

        for(String el : map.keySet()){
            if(map.get(el)!=1){
                count++;
            }
        }
        return count;
        
    }
}