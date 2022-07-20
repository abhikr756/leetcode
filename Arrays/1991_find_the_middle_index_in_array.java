class Solution {
    public int findMiddleIndex(int[] nums) {
      int[] left = new int[nums.length];
        int sum = 0;
        for(int i=1; i<nums.length; i++)
        {
            sum = sum + nums[i-1];
            left[i] = sum;
        }
         sum = 0;
        int result = -1;
        for(int i=nums.length-1; i>=0; i--) 
        {
            if(sum == left[i]) 
                 result = i;
            sum = sum + nums[i];
        }
        return result;  
    }
}