class Solution {
    public boolean areOccurrencesEqual(String s) {
        int alpha []= new int [26], count=0;
        for(int i=0; i<s.length(); i++)
        {
            alpha[s.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++)
        {
            if(count==0 && alpha[i]!=0)
                count=alpha[i];
            
            else if(alpha[i]!=0 && alpha[i]!=count)
                return false;
        }
        return true;
    }
}