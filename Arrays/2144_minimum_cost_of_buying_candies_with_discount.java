class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int len = cost.length;
        int sum = 0;
        int i = len - 1;
        for(; i>=2; i-=3) {
            sum += (cost[i] + cost[i-1]);
        }
        if(i == 1){
            sum += (cost[1] + cost[0]);
        } else if (i == 0) {
            sum += cost[0];
        }
        return sum;
    }
}