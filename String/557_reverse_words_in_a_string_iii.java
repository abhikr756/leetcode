class Solution {
    public String reverseWords(String s) {
        char c[]=s.toCharArray();
        int start=0,end=0;
        for(;end<s.length();end++)
        {
            if(c[end]==' ')
            {
                reverse(c,start,end-1);
                start=end+1;
            }
        }
        reverse(c,start,end-1);
        return new String(c);
    }
      public void reverse(char c[],int start, int end)
      {
        char temp;
        while(start<end)
        {
            temp=c[start];
            c[start]=c[end];
            c[end]=temp;
            start++;
            end--;
        }
    }
}