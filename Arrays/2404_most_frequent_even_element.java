class Solution {
    public int mostFrequentEven(int[] nums) {
     Map<Integer,Integer> map=new HashMap<>();
        int max=-1;
        int res=Integer.MAX_VALUE;
        for(int i:nums)
        {
            if(i%2 == 0)
            {
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>max)
            {                
            max=Math.max(max,map.get(i));
            res=i;
            }                                   
            else if(map.get(i)==max && res>i)
            { 
                res=i;
            }
            }
        }  
        return res==Integer.MAX_VALUE? -1: res;    
    }
}