class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for(int i : nums){
            set.add(i);
        }
        Arrays.sort(nums);
        int ans = -1;
        for(int i = nums.length-1; i >= 0; i--){
            if(set.contains(-nums[i])){
                return ans = nums[i];
            }
        }
        return ans;
    }
}