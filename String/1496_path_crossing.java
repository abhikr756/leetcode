class Solution {
    public boolean isPathCrossing(String path) {
      Set<String> visited = new HashSet<>();
        int x = 0, y = 0;
        visited.add("(0,0)");
        for(char c : path.toCharArray()) {
            switch(c) {
                case 'N': y++;
                    break;
                case 'S': y--;
                    break;
                case 'W': x--;
                    break;
                case 'E': x++;
                    break;
            }
            String newVisit ="(" + x + "," + y + ")";
            System.out.println(visited);
            if (visited.contains(newVisit)) {
                return true;
            }
            visited.add(newVisit);
        }
        return false;  
    }
}