class Solution {
    public int maximumXOR(int[] nums) {
      int cnt=0;
        int a=0;
        for(int i:nums)
        {
            a=a|i;
        }
        return a;  
    }
}