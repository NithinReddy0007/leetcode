class Solution {
    public boolean check(char[][] x,int row,int col,int n){
        int durow=row;
        int ducol=col;

        while(row>=0 && col>=0){
            if(x[row][col]=='Q'){
                return false;
            }
            row--;
            col--;
        }
        row=durow;
        col=ducol;

        while(row<n && col>=0){
            if(x[row][col]=='Q'){
                return false;
            }
            row++;
            col--;
        }
        row=durow;
        col=ducol;
        while(col>=0){
            if(x[row][col]=='Q'){
                return false;
            }
            col--;
        }
        return true;
    }
    public void recur(char[][] x,int n,int col,List<List<String>> ans){
        if(col==n){
            List<String> temp = new ArrayList<>();
            for(int i=0;i<n;i++){
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<n;j++){
                    sb.append(x[i][j]);
                }
                temp.add(sb.toString());
            }
            ans.add(temp);
            return ;
        }
        for(int row=0;row<n;row++){
            if(check(x,row,col,n)){
                x[row][col]='Q';
                recur(x,n,col+1,ans);
                x[row][col]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] x = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                x[i][j]='.';
            }
        }
        recur(x,n,0,ans);
        return ans;
    }
}