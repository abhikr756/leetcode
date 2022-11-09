class Solution {
    public int[] applyOperations(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        return moveZeroes(nums);   
    }
    public int[] moveZeroes(int[] nums) {
     if(nums.length == 0 || nums == null) return nums;
        int j = 0;
        for (int i : nums){
            if(i!=0) nums[j++] = i;
        }
        while (j< nums.length){
            nums[j++] = 0;
        }
        return nums;
    }
}