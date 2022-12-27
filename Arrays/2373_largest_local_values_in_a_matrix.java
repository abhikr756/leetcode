class Solution {
    public int[][] largestLocal(int[][] grid) {
    int n = grid.length;
    int max;
    int [][]largest = new int[n-2][n-2];
    for(int h = 0; h < n-2; h++){
        for(int i = 0; i < n-2; i++){
            max = -1;
            for(int j = h; j < 3+h; j++){
                for(int k = i; k < 3+i; k++){
                    if(max < grid[j][k])
                        max = grid[j][k];
                }
            }
            largest[h][i] = max;
        }
    }
    return largest;
    }
}