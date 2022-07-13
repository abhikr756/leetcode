class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String ss = s + s;
            ss = ss.substring(1, ss.length() - 1);
            return ss.contains(s);
    }
}