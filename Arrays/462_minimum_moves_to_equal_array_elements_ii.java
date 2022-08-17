class Solution {
    public int minMoves2(int[] nums) {
    int mid = 0;
    int sum = 0;
    int length = nums.length;
    Arrays.sort(nums);
    if(length % 2 == 0) {
        mid = nums[length/2 - 1];
    } else {
        mid = nums[length/2];
    }
    
    for(int i = 0; i < length; i++) {
        if(nums[i] != mid) {
            int diff = nums[i] - mid;
            if(diff < 0) {
                diff *= -1;
            } 
            sum += diff;
        }
    }
    return sum;
    }
}