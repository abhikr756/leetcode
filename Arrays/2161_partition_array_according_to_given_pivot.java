class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        ArrayList<Integer> bigger = new ArrayList<Integer>();
        int index = 0;
        int same = 0;
        for(int i = 0; i<nums.length ; i++){
            if (nums[i] < pivot)
                ans[index++] = nums[i];
            else if(nums[i] == pivot)
                same++;
            else
                bigger.add(nums[i]);
        }
        for(int i = 0; i<same; i++) ans[index++] = pivot;
        for(Integer i : bigger) ans[index++]= i;
        return ans;
    }
}