class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) 
        {
            int sum = 0;
            for (int a : account) 
            {
                sum += a;
            }
            maxWealth = Math.max(sum, maxWealth);
        }
        return maxWealth;
    }
}