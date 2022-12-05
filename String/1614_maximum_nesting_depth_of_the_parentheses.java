class Solution {
    public int maxDepth(String s) {
     int d = 0, left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') d = Math.max(d, ++left);
            else if (s.charAt(i) == ')') left--;
        }
        return d;   
    }
}