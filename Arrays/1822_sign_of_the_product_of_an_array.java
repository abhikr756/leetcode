class Solution {
    public int arraySign(int[] nums) {
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]>0)
           {
               nums[i]=1;
           }
           else if(nums[i]<0)
           {
               nums[i]=-1;
           }
           else
           {
               nums[i]=0;
           }
       }
        int prod=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                return 0;
            }
            else
            {
                prod=prod*nums[i];
            }
        }
        if(prod>0)
        {
            return 1;
        }
            return -1;
    }
}