class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int res = 0;
        int range = -1;
        for(int i =0;i<nums.length;i++){
            if(nums[i]<=range) continue;
            else{
                range = nums[i]+k;
                res++;
            }
        }
        return res;
    }
}