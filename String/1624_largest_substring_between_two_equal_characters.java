class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
       int max = 0;
        boolean found = false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                found = true;
                max = Math.max(max, i - map.get(c) - 1);
            } else {
                map.put(c, i);
            }
        }
        return found ? max : -1; 
    }
}