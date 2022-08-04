class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        
        int[] ans = new int[l1];
        
        for(int i=0;i<l1;i++)
        {
            boolean flag = false;
            for(int j=0;j<l2;j++)
            {
                if(nums1[i] == nums2[j])
                {
                    flag=true;
                }
                
                if(flag && nums1[i] < nums2[j])
                {
                    ans[i] = nums2[j];
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                ans[i] = -1;
            }
        }
        return ans;

    }
}