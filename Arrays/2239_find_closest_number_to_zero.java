class Solution {
    public int findClosestNumber(int[] nums) {
        int neg = -100001;
        int pos =  100001;
    
        for(int n : nums)
        {
             if(n == 0)
             {
                 return 0;
             }
             else if (n <  0)
             {
                  neg = Math.max(neg, n);
             }
               else
             {
                   pos = Math.min(pos, n);
             }
        }  
        if (-neg < pos) 
        {
            return neg;
        }
    return pos;  
    }
}