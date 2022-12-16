class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int res = 0;
        for (int[] row: grid) {
            Arrays.sort(row);
        }
        for (int j = 0; j < grid[0].length; j ++) {
            int maxVal = Integer.MIN_VALUE;
            for (int[] row: grid) {
                maxVal = Math.max(maxVal, row[j]);
            }
            res += maxVal;
        }
        return res;    
    }
}