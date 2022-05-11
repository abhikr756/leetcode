class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int n = nums.length;
        int min = nums[0];
        int max = nums[0];
        
        for(int i = 0; i < n; i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        

        return (min+k >= max-k) ? 0 : (max-k) - (min+k);
    }
}