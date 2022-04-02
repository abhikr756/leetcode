class Solution {
    public int thirdMax(int[] nums) {
       Arrays.sort(nums);
      ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!a.contains(nums[i]))
            {
                a.add(nums[i]);
            }
        }
        if(a.size()==1)
        {
            int n1=a.get(0);
            return n1; 
        }
        else if(a.size()==2)
        {
            int n2=a.get(1);
            return n2; 
        }
        else if(a.size()==3)
        {
            int n3=a.get(0);
            return n3;
        }
        int n4=a.get(a.size()-3);
        return n4;
    }
}