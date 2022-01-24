class Solution {
    public int lengthOfLongestSubstring(String s) {
       if(s.length()<=1)
       {
           return s.length();
       }
        int max=1,ptr=0;
        for(int i=1;i<s.length();i++)
        {
            int index=s.indexOf(s.charAt(i),ptr);
            if(index<i)
            {
                ptr=index+1;
            }
            max=Math.max(max,i-ptr+1);
        }
        return max;
    }
}