class Solution {
    public int[] sortArrayByParity(int[] nums) 
    {
        int answer[]= new int[nums.length];
        int begin=0;
        int end=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] % 2 == 0)
            {
                answer[begin++]=nums[i];
            }
            else
            {
                answer[end--]=nums[i];
            
            }
        }
        return answer;
    }
}

       