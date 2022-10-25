class Solution {
    public int[] decompressRLElist(int[] nums) {
      List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = nums[i++];
            int m = nums[i];
            for (int j = 0; j < count; j++) {
                list.add(m);   
            }
        }
        return list.stream().mapToInt(i -> i).toArray();  
    }
}