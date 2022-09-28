class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
      Map<Integer, String> peoples = new HashMap<Integer, String>();
        for(int i = 0; i < heights.length; i++)
            peoples.put(heights[i], names[i]);
        
        Arrays.sort(heights);
        int index = 0;
        String[] sortedPeople = new String[heights.length];
        for(int i = heights.length - 1; i >= 0; i--){
            sortedPeople[index] = peoples.get(heights[i]);
            index++;
        }
        return sortedPeople;  
    }
}