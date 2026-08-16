class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++){
            int sum=0;
            for(char el : words[i].toCharArray()){
                sum=sum+weights[el-97];
            }
            System.out.println(sum);
            int v = sum%26;
            sb.append((char)(122-v));
        }
        return sb.toString();
        
    }
}