class Solution {

    public boolean rec(char[][] nums){

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(nums[i][j]=='.'){
                    for(char c = '1';c<='9';c++){
                        if(check(nums,i,j,c)){
                            nums[i][j]=c;
                            if(rec(nums)){
                                return true;
                            } else {
                                nums[i][j]='.'; 
                            }
                        } 
                    }
                    return false;
                }
            }
        }
        return true;
        
    }

    public boolean check(char[][] nums,int row,int col,char c){
        for(int i=0;i<9;i++){
            if(nums[i][col]==c) return false;
            if(nums[row][i]==c) return false;
            
            
        }
        int rs = (row/3)*3;
        int cs = (col/3)*3;

        for(int i=rs;i<=rs+2;i++){
            for(int j=cs;j<=cs+2;j++){
                if(nums[i][j]==c) return false;
            }
        }

        return true;


    }
    public void solveSudoku(char[][] nums) {

        boolean x = rec(nums);
        
    }
}