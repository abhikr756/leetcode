class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
      int m = mat.length;
        int n = mat[0].length;
        
        if(m*n != r*c){
            return mat;
        }
        
        int row = 0;
        int col = 0;
        int ans[][] = new int[r][c];
        
        for(int []e:mat){
            for(int ele:e){
                ans[row][col] = ele;
                col++;
                if(col == c){
                    col = 0;
                    row++;
                }
            }
        }
        return ans;  
    }
}