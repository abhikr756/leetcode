class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=nums.length-1;i>=1;i--)
        {
            if(nums[i]==nums[i-1])
            {
                continue;
            }
            else
            {
                sum=sum+(nums.length-i);
            }
        }
        return sum;
    }
}