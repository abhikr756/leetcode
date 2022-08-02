class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int temp[]=new int [matrix.length * matrix.length];
       for(int i=0;i<matrix.length;i++)
       {
           for(int j=0;j<matrix.length;j++)
           {
             temp[(i*matrix.length)+j]=matrix[i][j];  
           }
       }
        Arrays.sort(temp);
        return temp[k-1];
    }
}