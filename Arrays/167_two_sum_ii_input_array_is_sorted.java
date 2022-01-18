class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int answer[]=new int[2];
    if(numbers==null || numbers.length<2)
    {
        return answer;
    }
        int start=0;
        int end=numbers.length-1;
        while(start<end)
        {
            int mid=numbers[start]+numbers[end];
            if(mid==target)
            {
                answer[0]=start+1;
                answer[1]=end+1;
                break;
            }
            else if(mid<target)
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        return answer;
    }
}