class Solution:
    def check(self,x,row,col,n):
        durow=row
        ducol=col

        while(row>=0 and col>=0):
            if x[row][col]=="Q":
                return False
            row-=1
            col-=1
        row=durow
        col=ducol
        while(row<n and col>=0):
            if x[row][col]=="Q":
                return False
            row+=1
            col-=1
        row=durow
        col=ducol
        while col>=0:
            if x[row][col]=="Q":
                return False
            col-=1
        return True
    def recur(self,x,n,col,ans):
        if(col==n):
            temp=[]
            for el in x:
                temp.append("".join(el))
            ans.append(temp)
            return  
        for row in range(n):
            if(self.check(x,row,col,n)):
                x[row][col]="Q"
                self.recur(x,n,col+1,ans)
                x[row][col]="."
    def solveNQueens(self, n: int) -> List[List[str]]:
        x=[["." for _ in range(n)] for _ in range(n)]
        ans=[]
        self.recur(x,n,0,ans)
        return ans

        