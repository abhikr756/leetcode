class Solution {
    public long zeroFilledSubarray(int[] nums) {
       long cnt = 0, count = 0;
        for (int n : nums) {
            if (n == 0) {
                cnt += ++count;
            }else {
                count= 0;
            }
        }
        return cnt; 
    }
}