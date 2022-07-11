class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
    int min = Integer.MAX_VALUE;
    int n = nums.length;
    int start = 0;
    int end = start + k - 1;
    while(end < n)
    {
        min = Math.min(min, nums[end] - nums[start]);        
        start++;
        end = start + k - 1;
    }
    
    return min;
    }
}