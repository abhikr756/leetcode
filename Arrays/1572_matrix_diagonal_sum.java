class Solution {
    public int diagonalSum(int[][] mat) {
       int sum=0;
    int m=mat.length;
    int p=m-1;
    int x=0;
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(p>=0 && x<m)
            {
                sum=sum+mat[x][p];
                if(x==p)
                {
                    sum=sum-mat[x][p];
                }
                p--;
                x++;
            }
             if(i==j)
            {
                sum=sum+mat[i][j];
            }
        }
    }
    return sum; 
    }
}