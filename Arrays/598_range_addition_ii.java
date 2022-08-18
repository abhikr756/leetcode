class Solution {
    public int maxCount(int m, int n, int[][] ops) {
       int res_m = m, res_n = n;
	for (int i = 0; i < ops.length; ++i)
    {
		res_m = Math.min(res_m, ops[i][0]);
		res_n = Math.min(res_n, ops[i][1]);
	}
	return res_n * res_m; 
    }
}