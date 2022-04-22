class Solution {
    public int findMin(int[] nums) {
         if(nums[nums.length - 1] >= nums[0]) return nums[0];

        int l = 0, r = nums.length - 1;

        while(l <= r){
            int mid = l + (r - l) / 2;
            int val = nums[mid];
            if(val >= nums[l]){
                if(val <= nums[r]){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            }else if(val < nums[r]){
                r = mid;
            }
        }

        return nums[l];
    }
}