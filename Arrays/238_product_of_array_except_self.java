class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int prod1=1,prod2=1;
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=prod1;
            prod1*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            ans[i]*=prod2;
            prod2*=nums[i];
        }
        return ans;
    }
}