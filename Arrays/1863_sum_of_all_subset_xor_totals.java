class Solution {
    int ans=0;
    public int subsetXORSum(int[] nums)
    {
        req(nums,0,0);
        return ans;
    }
    public void req(int[] nums,int index,int n)
    {
        ans+=n;
        for(int i=index; i<nums.length; i++)
        {
            req(nums,i+1,n^nums[i]);
        }
    }
}