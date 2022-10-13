class Solution {
    public int[] numberOfPairs(int[] nums) {
      int[] res = new int[2];
    HashSet<Integer> set = new HashSet<>();
    int count=0;
    for(int num: nums){
        if(set.contains(num)){
            set.remove(num);
            count++;
        }else{
            set.add(num);
        }
    }
    res[0] = count;
    res[1] = set.size();
    return res;  
    }
}