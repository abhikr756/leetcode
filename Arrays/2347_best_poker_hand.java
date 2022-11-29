class Solution {
    public String bestHand(int[] ranks, char[] suits) {
      Map<Integer, Integer> rankmap = new HashMap<>();
            Map<Character, Integer> suitmap = new HashMap<>();

            for(int r: ranks){
                rankmap.put(r, rankmap.getOrDefault(r, 0) + 1);
            }

            for(char s: suits){
                suitmap.put(s, suitmap.getOrDefault(s, 0) + 1);
            }
			
			// Being smart about the conditons
            if(suitmap.containsValue(5)){
                return "Flush";
            }
            if(rankmap.containsValue(5) || rankmap.containsValue(4) || rankmap.containsValue(3)){
                return "Three of a Kind";
            }
            if(rankmap.containsValue(2)){
                return "Pair";
            }
            return "High Card";
           
    }
}