class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>h= new HashMap<>();
        for(int a: arr)
        {
            h.put(a,h.getOrDefault(a,0)+1);
        }
        HashSet<Integer> hunique = new HashSet<>();
        for (int val : h.values())
        {
            if (hunique.contains(val)) 
            {
                return false;
            } else 
            {
                hunique.add(val);
            }
        }
        return true;
    }
}