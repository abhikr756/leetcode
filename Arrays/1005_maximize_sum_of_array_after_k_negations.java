class Solution {
    static int indexMin(int[] nums)
    {
        int min = 10001;
        int min_index = 0;
        for(int i = 0; i < nums.length; i++)
            if(nums[i] <= min)
            {
                min = nums[i];
                min_index = i;                
            }
        
        return min_index;
    }
    
    public int largestSumAfterKNegations(int[] nums, int k) 
    {
        while(k > 0)
        {
            int index = indexMin(nums);
            nums[index] = 0 - nums[index];
            k--;
        }
        
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
            sum += nums[i];
        
        return sum;
        
        
    }
}