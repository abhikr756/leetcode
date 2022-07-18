class Solution {
    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer i : nums) {
            min = Math.min(i, min);
            max = Math.max(max, i);
        }
        int minCount = 0;
        int maxCount = 0;
        for (Integer i : nums) {
            if (i == min) {
                minCount++;
            }
            if (i == max) {
                maxCount++;
            }
        }
        return Math.max(0,nums.length - minCount - maxCount);
    }
}