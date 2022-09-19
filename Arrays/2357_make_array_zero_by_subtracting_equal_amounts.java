class Solution {
    public int minimumOperations(int[] nums){
    HashSet<Integer> set = new HashSet<>();
    for(int e : nums)
    {
        if(e != 0 && !set.contains(e))
        {
            set.add(e);
        }
    }
    return set.size();
    }
}