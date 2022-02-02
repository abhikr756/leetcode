class Solution {
    public boolean halvesAreAlike(String s) {
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2);
        int a_count=CountVowels(a);
        int b_count=CountVowels(b);
        if(a_count==b_count)
        {
            return true;
        }
        return false;
    }
    private int CountVowels(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
            {
               count++; 
            }
        }
        return count;
    }
}