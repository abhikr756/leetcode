class Solution {
    public int[] rearrangeArray(int[] nums) {
     int ans[]=new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                ans[index]=nums[i];
                index=index+2;
            }
        }
        index=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                ans[index]=nums[i];
                index=index+2;
            }
        }
        return ans;
    }
}