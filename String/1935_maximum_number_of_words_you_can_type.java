class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
      int c = 0;
    String str[] = text.split(" ");
    for(int i = 0;i<str.length;i++)
    {
        boolean flag = false;
        for(int j = 0;j<brokenLetters.length();j++)
        {
            if(str[i].contains(brokenLetters.charAt(j)+""))
            {
                flag = true;
                break;
            }
        }
        if(!flag)
            c++;
    }
    return c;
    }
}