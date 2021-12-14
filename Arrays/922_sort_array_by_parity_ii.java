class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int answer[]=new int[nums.length];
        int oddindex = 1;
        int evenindex = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i]%2==0) 
            {
            answer[evenindex]=nums[i];
            evenindex+=2;
            }
            else
            {
            answer[oddindex]=nums[i];
            oddindex+=2;
            }
        }
        return answer;
    }
}