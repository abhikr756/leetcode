class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int size = rows*cols;
        List<List<Integer>> shifted = new ArrayList();
        for (int r=0; r < rows; r++) {
            ArrayList<Integer> each_row = new ArrayList();
            for (int c=0; c < cols; c++) {
                int src_offset = (r*cols+c+size-(k%size))%size;
                int src_row = src_offset / cols;
                int src_col = src_offset % cols;
                each_row.add(grid[src_row][src_col]);
            }
            shifted.add(each_row);
        }
        return shifted; 
    }
}