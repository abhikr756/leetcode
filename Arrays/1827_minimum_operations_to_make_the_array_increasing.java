class solution {
    public int minOperations(int[] nums) {
        int ans=0,n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]>=nums[i+1])
            {
                ans+=nums[i]-nums[i+1]+1;
                nums[i+1]=nums[i]+1;
            }
        }
        return ans;
    }
}