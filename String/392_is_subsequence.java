class Solution {
    public boolean isSubsequence(String s, String t) {
          String p=""; String o="";
  int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length(); 
   
    }
}