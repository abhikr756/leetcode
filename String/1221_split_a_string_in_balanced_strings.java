class Solution {
    public int balancedStringSplit(String s) {
        int count=0,num=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='L')
            {
                num++;
            }
            else
            {  
                num--;
            }
            if(num==0)
            { 
                count++;
            }
        }
        return count;
      }
}