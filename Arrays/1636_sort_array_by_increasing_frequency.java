class Solution {
    public int[] frequencySort(int[] nums) {
      HashMap<Integer,Integer> hmap=new HashMap<>();
       for(int i : nums)
       {
           hmap.put(i,hmap.getOrDefault(i,0)+1);
       }
       List<Integer> list = new ArrayList<>(hmap.keySet());
       Collections.sort(list,(a,b) -> hmap.get(a)==hmap.get(b) ? b-a: hmap.get(a)-hmap.get(b));
       int ans[]=new int [nums.length];
        int k=0;
       for(int i: list)
       {
            for(int j=0;j<hmap.get(i);j++)
            {
                ans[k++]=i;
            }
       }
        return ans;
    }
}