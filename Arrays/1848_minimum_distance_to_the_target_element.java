class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
      int t=start;
        int ans;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                ans=Math.abs(i-t);
                if(ans<min){
                    min=ans;
                }
            }
        }
        return min;  
    }
}