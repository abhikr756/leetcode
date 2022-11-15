class Solution {
    public int numOfPairs(String[] nums, String target) {
        int result = 0 ;
        int n = nums.length ;  
        for (int i = 0; i < n; i++)
            for (int j = i+1; j < n; j++) 
            {
                if ((nums[i] + nums[j]).equals(target))
                    result++ ;
                if ((nums[j] + nums[i]).equals(target))
                    result++ ;
            }
        return result ;
     }
}