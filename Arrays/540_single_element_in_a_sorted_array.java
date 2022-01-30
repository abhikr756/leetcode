class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }
        if(nums.length==0)
        {
            return 0;
        }
      int start=0,end=nums.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==nums[mid^1])
            {
                start=mid+1;
            }
            else 
            {
                end=mid;
            }
        }
        return nums[start];
    }
}