class Solution {
    public int maximumProduct(int[] nums) {
     Arrays.sort(nums);
        int prod1=0,prod2=0;
        for(int i=0;i<nums.length;i++)
        {
            prod1=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
            prod2=nums[0]*nums[1]*nums[nums.length-1];
        }
        if(prod1>prod2)
        {
            return prod1;
        }
        return prod2;
    }
}