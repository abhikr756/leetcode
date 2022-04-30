class Solution {
    public boolean squareIsWhite(String coordinates) {
        char ch[]=coordinates.toCharArray();
        int alphachar=ch[0]-'0';
        int numericchar=ch[1]-'0';
        int merge=alphachar+numericchar;
        if(merge%2==0)
        {
            return false;
        }
        return true;
    }
}