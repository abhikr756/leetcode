class Solution {
    public int wiggleMaxLength(int[] nums) {
        int res = 0;
        int prev = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                if (prev == 0) {
                    res++;
                    prev = 1;
                }
                if (prev == 2) {
                    res++;
                    prev = 1;
                }
            } else if (nums[i - 1] > nums[i]) {
                if (prev == 0) {
                    res++;
                    prev = 2;
                }
                if (prev == 1) {
                    res++;
                    prev = 2;
                }
            }
        }

        return res + 1;  
    }
}