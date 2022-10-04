class Solution {
    public String reversePrefix(String word, char ch) {
       String rev="";
        String new1="";
        new1+=ch;
    if(!word.contains(new1))
    {
        return word;
    }
    int i=0;
    for(i=0;i<word.length();i++)
    {
        int flag=0;
        if(ch==word.charAt(i))
        {
            for(int j=i;j>=0;j--)
            {
                rev+=word.charAt(j);
                flag=1;
            }
        }
       if(flag==1)
       break;
    }
    rev+=word.substring(i+1);
    return rev; 
    }
}