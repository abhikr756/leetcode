class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        char[] ch = s.toCharArray();
        int index = s.length()-1;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(ch[i]==' '&&index==i)
            {
                index--;
            }
            else if(ch[i]!=' ')
            {
                count++;
            }
            else
                    break;
        }
        return count;
    }
}