class Solution {
    public int countDistinctIntegers(int[] nums) {
     Set<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
            int k = reversDigits(nums[i]);
            set.add(k);
        }
        
        return set.size();
    }
    
    static int reversDigits(int num)
    {
        StringBuffer string = new StringBuffer(String.valueOf(num));
        string.reverse();
        num = Integer.parseInt(String.valueOf(string));
 
        return num;   
    }
}