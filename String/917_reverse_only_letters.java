class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder reverse = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(Character.isAlphabetic(c)) 
            {
                reverse.insert(0, c);
            } 
        }
        for(int i = 0; i < s.length(); i++)
        {
             char c = s.charAt(i);
            if(!Character.isAlphabetic(c))
            {
                reverse.insert(i, c);
            }
        }
        return reverse.toString();
    }
}