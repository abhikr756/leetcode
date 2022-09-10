class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
       Map<String, Integer> map = new HashMap();
        for(String s : s1.split(" "))
        {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for(String s : s2.split(" ")) 
        {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<String> list = new ArrayList();
        for(String key : map.keySet())
        {
            if(map.get(key) == 1) list.add(key);
        }
        String[] ans = new String[list.size()];
        int i = 0;
        for(String str : list) ans[i++] = str;
        return ans; 
    }
}