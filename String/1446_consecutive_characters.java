class Solution {
    public int maxPower(String s) {
        int count = 1;
    int max = 1;
    for(int i =1;i < s.length(); i++)
    {
        if(s.charAt(i) == s.charAt(i-1))
        {
            count = count +1;
        }
        else
        {
            count =1;
        }
      if(count > max)
        {
            max = count;
        }
    }
     return max;
    }
}