class Solution {
    public char findTheDifference(String s, String t) {
        int sumofS=0,sumofT=0;
        for(char ch:s.toCharArray())
        {
            sumofS+=ch;
        }    
        for(char ch:t.toCharArray())
        {
            sumofT+=ch;
        }    
        return (char)(sumofT-sumofS);
    }
}