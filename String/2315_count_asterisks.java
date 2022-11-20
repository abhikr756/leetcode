class Solution {
    public int countAsterisks(String s) {
   int slash = 0, ans = 0;
      for(int i = 0; i < s.length(); ++ i) {
          if(s.charAt(i) == '*' && slash % 2 == 0)
          ans ++;
          
          if(s.charAt(i) == '|')
          slash++;
      } 
      return ans; 
    }
}