class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> hset=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(hset.contains(s.charAt(i)))
            {
                return s.charAt(i);
            }
            else
            {
                hset.add(s.charAt(i));
            }
        }
        return ' ';
    }
}