class Solution {
    public int[] numberOfLines(int[] widths, String s) {
      int sumsofar = 0;
        int lines = 0;
        for(int i=0;i<s.length();i++)
        {
            if(sumsofar + widths[s.charAt(i)-'a'] <= 100)
                sumsofar += widths[s.charAt(i)-'a'];
            else
            {
                lines++;
                sumsofar = widths[s.charAt(i)-'a'];
            }
        }
        return new int[] {lines+1, sumsofar};  
    }
}