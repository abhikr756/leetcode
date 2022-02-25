class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer>ans1=new HashSet<Integer>();
       Set<Integer>ans2=new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++)
        {
            ans1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(ans1.contains(nums2[i]))
                ans2.add(nums2[i]);
        }
        int res[]=new int[ans2.size()];
        int i=0;
        for(Integer x : ans2)
        {
            res[i++]=x;
        }
        return res;
    }
}